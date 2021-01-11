package org.aop.config;

import org.aop.dao.MyCalculator;
import org.aop.impl.MyCalculatorImpl;
import org.bean.dao.ShowCmd;
import org.bean.impl.LinuxCondition;
import org.bean.impl.LinuxShowCmd;
import org.bean.impl.WinShowCmd;
import org.bean.impl.WindowsCondition;
import org.bean.javaboy.DataSource;
import org.bean.main.SayHello;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.aop.service")
public class JavaConfig {

}
