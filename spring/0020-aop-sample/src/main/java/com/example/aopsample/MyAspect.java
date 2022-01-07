package com.example.aopsample;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    private static Log LOGGER = LogFactory.getLog(MyAspect.class.getName());

    @Pointcut("execution(public * com.example.aopsample.calc.*.*(..))")
    public void allMethodsInCalculation(){

    }

    @Around("allMethodsInCalculation()")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        LOGGER.info("inside around aspect");

        Object obj = proceedingJoinPoint.proceed(proceedingJoinPoint.getArgs());
        return obj;
    }
}
