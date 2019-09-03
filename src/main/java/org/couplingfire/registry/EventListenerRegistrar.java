package org.couplingfire.registry;

import org.couplingfire.core.EnableCouplingFire;
import org.couplingfire.scanner.ClassPathArsonistScanner;
import org.couplingfire.util.StringUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/27
 */
public class EventListenerRegistrar implements ResourceLoaderAware, ImportBeanDefinitionRegistrar {

    private ResourceLoader resourceLoader;



    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        AnnotationAttributes annotationAttr = AnnotationAttributes.fromMap(annotationMetadata.getAnnotationAttributes(EnableCouplingFire.class.getName()));
        List<String> basePackages = preparedScanPakages(annotationAttr);
        registerArsonist(basePackages, beanDefinitionRegistry);
    }

    protected void registerArsonist(List<String> basePackages, BeanDefinitionRegistry registry) {
        ClassPathArsonistScanner scanner = new ClassPathArsonistScanner(registry);
        if (null != resourceLoader) {
            scanner.setResourceLoader(resourceLoader);
        }
        scanner.doScan(org.springframework.util.StringUtils.toStringArray(basePackages));
    }

    protected List<String> preparedScanPakages(AnnotationAttributes annoAttr) {
        if (null == annoAttr)
            return Collections.emptyList();
        List<String> scanPakages = new ArrayList<String>();
        String[] basePackages = annoAttr.getStringArray("basePackages");
        Class[] basePackageClasses = annoAttr.getClassArray("basePackagesClass");
        scanPakages.addAll(StringUtils.toList(basePackages));
        for (int i = 0; i < basePackageClasses.length; i++) {
            scanPakages.add(ClassUtils.getPackageName(basePackageClasses[i]));
        }
        return scanPakages;
    }

}
