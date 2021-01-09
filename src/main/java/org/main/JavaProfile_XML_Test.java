package org.main;
import org.javaboy.DataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// profile通过XML文件配置

public class JavaProfile_XML_Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx
                = new ClassPathXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.setConfigLocation("applicationContext.xml");
        ctx.refresh();
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
