package org.aop.main;

import org.aop.impl.MyCalculatorImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理
public class CalculatorProxy {
    public static void main(String[] args) {

    }
    public static Object getInstance(final MyCalculatorImpl myCalculator) {
        return Proxy.newProxyInstance(
                CalculatorProxy.class.getClassLoader(),
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
                     System.out.println(method.getName() + "方法开始执行啦。。。。。。。。。。");
                     Object invoke = method.invoke(myCalculator, args);
                     System.out.println(method.getName() + "方法执行结束啦。。。。。。。。。。");

                     return invoke;
                 }

        });

    }
}
