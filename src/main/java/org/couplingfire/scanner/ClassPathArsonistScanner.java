package org.couplingfire.scanner;

import org.couplingfire.listener.EventListener;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/31
 */
public class ClassPathArsonistScanner extends ClassPathBeanDefinitionScanner {

    public ClassPathArsonistScanner(BeanDefinitionRegistry register) {
        super(register, false);
    }

    @Override
    public Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitions = super.doScan(basePackages);
        if (beanDefinitions.isEmpty()) {
            logger.info("CouplingFire component not found in" + Arrays.toString(basePackages));
        } else {
            processArsonist(beanDefinitions);
        }
        return beanDefinitions;
    }

    public void registerFilter() {
        this.addExcludeFilter(new AnnotationTypeFilter(Component.class));
        this.addIncludeFilter(new AnnotationTypeFilter(EventListener.class));
    }

    protected void processArsonist(Set<BeanDefinitionHolder> beanDefinitionHolders) {
        Iterator iterator = beanDefinitionHolders.iterator();
        while (iterator.hasNext()) {
            BeanDefinitionHolder holder = (BeanDefinitionHolder) iterator.next();
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition) holder.getBeanDefinition();
            beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
        }
    }

    @Override
    protected boolean isCandidateComponent(MetadataReader metadataReader) throws IOException {
        return metadataReader.getAnnotationMetadata().isIndependent() && metadataReader.getAnnotationMetadata().isInterface();
    }
}
