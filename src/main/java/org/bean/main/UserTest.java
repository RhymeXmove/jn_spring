package org.bean.main;

import com.alibaba.fastjson.JSON;
import org.bean.javaboy.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        User user_object = (User) ctx.getBean("user_object");
        System.out.println(JSON.toJSONString(user_object));

        User user_arry = (User) ctx.getBean("user_arry");
        System.out.println(JSON.toJSONString(user_arry));

        User user_list = (User) ctx.getBean("user_list");
        System.out.println(JSON.toJSONString(user_list));

        User user_map = (User) ctx.getBean("user_map");
        System.out.println(JSON.toJSONString(user_map));

        User user_properties = (User) ctx.getBean("user_properties");
        System.out.println(JSON.toJSONString(user_properties));

    }
}
