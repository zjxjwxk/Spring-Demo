package com.imooc.aop.schema.advice;

import org.aspectj.lang.JoinPoint;

public class MoocAspect {
    public void before(JoinPoint joinPoint) throws Throwable {
        System.out.println("MoocAspect before.");
    }
}
