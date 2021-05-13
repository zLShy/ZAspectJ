package com.zl.zaspectj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 参数对应的key
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface ParmasAnnotation {
    String value() default "";
}
