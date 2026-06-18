package com.deepak.basicSpringFse.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    @Before("execution (* com.deepak.basicSpringFse.service.*.*(..))")
    public void logging(){
        System.out.println("The user logged in");
    }
    @After("execution (* com.deepak.basicSpringFse.service.*.*(..))")
    public void completed(){
        System.out.println("Process Completed");
    }
}
