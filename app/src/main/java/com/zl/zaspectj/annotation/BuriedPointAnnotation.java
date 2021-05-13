package com.zl.zaspectj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@CommonAnnotationBase(type = "click", actionId = "10000")
public @interface BuriedPointAnnotation {
    String value() default "";
}
