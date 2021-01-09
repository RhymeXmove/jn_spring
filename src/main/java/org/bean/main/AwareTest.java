package org.bean.main;

import org.bean.config.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareTest {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        org.bean.aware.SayHello hello = ctx.getBean(org.bean.aware.SayHello.class);
        System.out.println(hello.sayHello("AwareTestUser"));
    }
}
