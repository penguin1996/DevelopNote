package com.jay.develop.java.dynamic_proxy.practice;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 定义两个注解参数，一个标示URI注解，一个标示参数
 *
 * @author wangxuejie
 * @version 1.0
 * @date 2019-12-02 18:19
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface RouterParam {
    String value() default "";

}
