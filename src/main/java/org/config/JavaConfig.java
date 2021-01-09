package org.config;

import org.dao.ShowCmd;
import org.impl.LinuxCondition;
import org.impl.LinuxShowCmd;
import org.impl.WinShowCmd;
import org.impl.WindowsCondition;
import org.javaboy.DataSource;
import org.main.SayHello;
import org.springframework.context.annotation.*;

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


    @Bean("ds")
    @Profile("dev")
    DataSource devDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/dev");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        return dataSource;
    }

    @Bean("ds")
    @Profile("prod")
    DataSource prodDataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl("jdbc:mysql://192.158.222.33:3306/dev");
        dataSource.setUsername("jkldasjfkl");
        dataSource.setPassword("jfsdjflkajkld");
        return dataSource;
    }
}
