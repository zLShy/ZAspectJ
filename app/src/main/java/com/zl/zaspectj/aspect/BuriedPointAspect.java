package com.zl.zaspectj.aspect;

import android.util.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class BuriedPointAspect {

    @Pointcut("execution(@com.zl.zaspectj.annotation.BuriedPointAnnotation * *(..))")
    public void onclickTask() {
    }

    @Around("onclickTask()")
    public void exectionClickData(ProceedingJoinPoint joinPoint) {

        Log.e("LogUtils", "--------onclick--------");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
