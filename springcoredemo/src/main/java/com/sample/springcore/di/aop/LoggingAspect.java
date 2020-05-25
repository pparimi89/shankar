package com.sample.springcore.di.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterThrowing(pointcut = "execution( * ShoppingCartAOP.*(..) )", throwing = "error")
    public void addLogAfterThrowingMethodExecution(JoinPoint joinPoint, Throwable error){
        System.out.println("error >>>>>> "+error.getMessage()+" --- Trace ");
        //error.printStackTrace();
    }

    @Around("@annotation(LogExecutionTime)")
    public void addLogBeforeMethodExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("********Around start*********");
        long cuurentTime = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();
        long afterExecTime = System.currentTimeMillis();
        System.out.println("********Around End*********");
        System.out.println("<<Time of execution>>  "+(afterExecTime - cuurentTime));
    }

}
