package com.pcz.security.web.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author picongzhi
 */
@Aspect
@Component
public class TimeAspect {
    @Around("execution(* com.pcz.security.web.controller.UserController.*(..))")
    public Object handleControllerMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("time aspect start");
        long start = System.currentTimeMillis();
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println("arg is " + arg);
        }
        Object result = proceedingJoinPoint.proceed();
        System.out.println("time aspect cost: " + (System.currentTimeMillis() - start));
        System.out.println("time aspect end");

        return result;
    }
}
