package com.springbootBasic.CRUD.aop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {
    public static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    // return type, class name, method name, args
    @Before("execution(* com.springbootBasic.CRUD.service.JobService.getAllJobs*(..)) ||" +
            "execution(* com.springbootBasic.CRUD.service.JobService.getJob*(..))")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called:-  " + jp.getSignature().getName());
    }


    // it will execute even any exception is there
    @After("execution(* com.springbootBasic.CRUD.service.JobService.getAllJobs*(..)) ||" +
            "execution(* com.springbootBasic.CRUD.service.JobService.getJob*(..))")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed:-  " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.springbootBasic.CRUD.service.JobService.getAllJobs*(..)) ||" +
            "execution(* com.springbootBasic.CRUD.service.JobService.getJob*(..))")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method has some issues:-  " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.springbootBasic.CRUD.service.JobService.getAllJobs*(..)) ||" +
            "execution(* com.springbootBasic.CRUD.service.JobService.getJob*(..))")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method Executed Successfully:-  " + jp.getSignature().getName());
    }

}
