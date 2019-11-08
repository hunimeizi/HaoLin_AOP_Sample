package com.haolin.aop.sample.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：haoLin_Lee on 2019/11/08 23:11
 * 邮箱：Lhaolin0304@sina.com
 * class:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginCheck {

}
