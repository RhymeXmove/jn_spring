package org.main;

import org.config.JavaConfig;
import org.dao.ShowCmd;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ShowCmdTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        ShowCmd showCmd = (ShowCmd) ctx.getBean("showCmd");
        System.out.println(showCmd.showCmd());
    }
}
