package org.bean.main;

import com.alibaba.fastjson.JSON;
import org.bean.config.JavaConfig;
import org.bean.javaboy.DataSource;
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
        System.out.println(JSON.toJSONString(ds));
    }
}
