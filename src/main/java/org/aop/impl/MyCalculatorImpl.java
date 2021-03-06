package org.aop.impl;
import org.aop.annotation.Action;
import org.aop.dao.MyCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyCalculatorImpl {
    @Autowired
    @Action
    public int add(int a, int b) {
        System.out.println(a+b);
        return a+b;
    }

    public void min(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}
