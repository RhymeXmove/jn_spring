package org.bean.main;

import org.bean.config.JavaConfig;
import org.bean.dao.ShowCmd;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowCmdTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd showCmd = (ShowCmd) ctx.getBean("showCmd");
        System.out.println(showCmd.showCmd());
    }
}
