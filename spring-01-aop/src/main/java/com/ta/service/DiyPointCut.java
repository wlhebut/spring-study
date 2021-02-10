package com.ta.service;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class DiyPointCut {

    @Before("execution(* com.ta.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("do something before");
    }

    @After("execution(* com.ta.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("do something after");
    }
}
