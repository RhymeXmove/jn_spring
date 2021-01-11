package org.aop.main;

import com.alibaba.fastjson.JSON;
import org.aop.config.JavaConfig;
import org.aop.dao.MyCalculator;
import org.aop.impl.MyCalculatorImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class CalculatorProxy {
    public static Object getInstance(final MyCalculatorImpl myCalculator) {
        return Proxy.newProxyInstance(CalculatorProxy.class.getClassLoader(),
                myCalculator.getClass().getInterfaces(),
                new InvocationHandler() {
                 /**
                  *   @param proxy 代理对象
                  *   @param method 代理的方法
                  *   @param args 方法的参数
                  *   @return
                  *   @throws Throwable
                  **/

                 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
                     System.out.println(method.getName() + "方法开始执行。。。。。。。。。。\n");
                     Object invoke = method.invoke(myCalculator, args);
                     System.out.println("方法执行结果:" + invoke+"\n");
                     System.out.println(method.getName() + "方法执行结束。。。。。。。。。。\n");

                     return invoke;
                 }

        });

    }

    public static void main(String[] args) {
        MyCalculatorImpl myCalculatorImpl = new MyCalculatorImpl();
        Object proxyArithmetic = CalculatorProxy.getInstance(myCalculatorImpl);
        ((MyCalculator)proxyArithmetic).add(1,2);
    }
}
