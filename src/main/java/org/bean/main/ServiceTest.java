package org.bean.main;

import org.bean.service.UserService;
import org.bean.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ServiceTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        System.out.println(userService.getAllUser());
    }
}
