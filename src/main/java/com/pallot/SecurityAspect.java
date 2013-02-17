package com.pallot;
 
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
 
@Component
@Aspect
public class SecurityAspect {
 @Pointcut("execution(* getName(..))")
 public void triggerSecurity() {
 }
 
 @Before("triggerSecurity()")
 public void process(JoinPoint joinPoint) {
 System.out.println("Checking security for: "
 + joinPoint.getSignature().getName());
 }
}