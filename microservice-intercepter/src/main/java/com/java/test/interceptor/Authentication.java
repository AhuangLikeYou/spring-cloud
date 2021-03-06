package com.java.test.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lu.xu on 2018/7/3.
 * TODO:用户认证注解:校验当前线程中是否存在用户信息
 * @Authentication既可以加在方法上也可以加在类上-优先级别：方法>实现类
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Authentication {
}