package org.main;

import com.alibaba.fastjson.JSON;
import org.javaboy.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = (User) ctx.getBean("user");
        System.out.println(JSON.toJSONString(user1));

        User user2 = (User) ctx.getBean("user2");
        System.out.println(JSON.toJSONString(user2));

    }
}
