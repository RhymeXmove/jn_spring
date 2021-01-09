package org.main;

import org.config.JavaConfig;
import org.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.getAllUser());
    }
}
