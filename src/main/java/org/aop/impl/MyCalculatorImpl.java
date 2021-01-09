package org.aop.impl;

import org.aop.dao.MyCalculator;

public class MyCalculatorImpl implements MyCalculator {
    public int add(int a, int b) {
        return a+b;
    }
}
