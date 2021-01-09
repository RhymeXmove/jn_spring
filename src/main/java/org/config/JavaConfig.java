package org.config;

import org.main.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.service")
public class JavaConfig {
    @Bean("javaboy")
    SayHello sayHello() {
        return new SayHello();
    }
}
