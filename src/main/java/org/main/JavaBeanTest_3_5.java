package org.main;

import org.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanTest_3_5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        SayHello hello = ctx.getBean(SayHello.class);
        System.out.println(hello.sayHello("javaboy"));
    }
}
