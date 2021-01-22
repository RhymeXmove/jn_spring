package org.aop.component;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
    @Pointcut(value = "execution(* org.aop.annotation.*.*(..))")
    public void pointcut2() {
    }

    @Pointcut(value = "@annotation(org.aop.annotation.Action)")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    public void before(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + "方法开始执行......");
    }

    @After("pointcut()")
    public void after(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + "方法结束了......");
    }

    @AfterReturning(value = "pointcut()", returning = "r")
    public void returning(JoinPoint joinPoint, Integer r) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + "方法返回：" + r);
    }

    @AfterThrowing(value = "pointcut()", throwing = "e")
    public void afterThorwing(JoinPoint joinPoint, Exception e) {
        Signature signature = joinPoint.getSignature();
        String name = signature.getName();
        System.out.println(name + "方法抛异常了：" + e.getMessage());
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) {
        Object proceed = null;
        try {
            proceed = pjp.proceed();
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;
    }

}
