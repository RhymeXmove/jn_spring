package org.config;

import org.dao.ShowCmd;
import org.impl.LinuxCondition;
import org.impl.LinuxShowCmd;
import org.impl.WinShowCmd;
import org.impl.WindowsCondition;
import org.main.SayHello;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.service")
public class JavaConfig {

    @Bean("javaboy")
    SayHello sayHello() {
        return new SayHello();
    }

    @Bean("showCmd")
    @Conditional(WindowsCondition.class)
    ShowCmd winCmd() {
        return new WinShowCmd();
    }

    @Bean("showCmd")
    @Conditional(LinuxCondition.class)
    ShowCmd LinuxCmd() {
        return new LinuxShowCmd();
    }
}
