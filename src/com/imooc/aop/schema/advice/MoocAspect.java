package com.imooc.aop.schema.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect before.");
    }

    public void afterReturning(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect afterReturning.");
    }

    public void afterThrowing(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect afterThrowing.");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect after.");
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MoocAspect around 1");
        Object obj = pjp.proceed();
        System.out.println("MoocAspect around 2");
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp, String bizName, int times) throws Throwable {
        System.out.println(bizName + "  " + times);
        System.out.println("MoocAspect aroundInit 1");
        Object obj = pjp.proceed();
        System.out.println("MoocAspect aroundInit 2");
        return obj;
    }
}
