package org.couplingfire.core;

import java.lang.annotation.*;

/**
 * @version 1.0.1
 * @auto jerry lee
 * @date 2019/8/24
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventListener {

    String value() default  "";

    /**
     * 监听的区域
     * @return
     */
    String regionName() default "";

    /**
     *调用的url
     * @return
     */
    String url() default "";
}
