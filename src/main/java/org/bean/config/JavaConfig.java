package org.bean.config;

import org.bean.main.SayHello;
import org.bean.dao.ShowCmd;
import org.bean.impl.LinuxCondition;
import org.bean.impl.LinuxShowCmd;
import org.bean.impl.WinShowCmd;
import org.bean.impl.WindowsCondition;
import org.bean.javaboy.DataSource;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.bean.service")
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

    @Bean("userDao333")
    org.bean.aware.SayHello sayHelloAware() {
        return new org.bean.aware.SayHello();
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
