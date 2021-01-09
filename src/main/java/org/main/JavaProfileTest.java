package org.main;

import org.config.JavaConfig;
import org.javaboy.DataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// profile通过java文件配置
public class JavaProfileTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(JavaConfig.class);
        ctx.refresh();
        DataSource ds = (DataSource) ctx.getBean("ds");
        System.out.println(ds);
    }
}
