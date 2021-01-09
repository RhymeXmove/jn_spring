package org.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SayHello implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public String sayHello(String name) {
//        判断容器中是否存在某个 Bean
        boolean userDao = applicationContext.containsBean("userDao333");
        System.out.println("容器中是否存在某个Bean：" + userDao);
        return "hello" + name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException{
        this.applicationContext = applicationContext;
    }

}
