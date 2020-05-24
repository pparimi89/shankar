package com.sample.springcore.di.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogTimeAspect {

/*    @Around("execution( * ShoppingCartAOP.*(..) )")*/
    public void addLogBeforeMethodExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("********Around start*********");
        long cuurentTime = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long afterExecTime = System.currentTimeMillis();
        System.out.println("********Around End*********");
        System.out.println("<<Time of execution>>  "+(afterExecTime - cuurentTime));
    }
}
