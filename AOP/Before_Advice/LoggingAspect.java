package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // Pointcut Expression: apply to all methods in StudentService
    @Before("execution(* org.example.StudentService.*(..))")
    public void logBeforeMethod() {
        System.out.println("👉 Log: A method is about to run...");
    }
}

