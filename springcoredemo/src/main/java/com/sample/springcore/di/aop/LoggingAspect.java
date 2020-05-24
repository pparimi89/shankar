package com.sample.springcore.di.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution( * ShoppingCartAOP.*(..) )")
    public void addLogBeforeMethodExecution(JoinPoint joinPoint){
        System.out.println("Before ***** "+joinPoint.getSignature().getName() + " Arguments ====>>> "+Arrays.asList(joinPoint.getArgs()));
    }

    @After("execution( * ShoppingCartAOP.*(..) )")
    public void addLogAfterMethodExecution(JoinPoint joinPoint){
        System.out.println(" After ****** "+joinPoint.getSignature().getName());
    }

    @AfterReturning(pointcut = "execution( * ShoppingCartAOP.*(..) )", returning = "returnVal")
    public void addLogAfterMethodExecution(JoinPoint joinPoint, Object returnVal){
        System.out.println("returnVal >>>>>> "+returnVal);
    }
}
