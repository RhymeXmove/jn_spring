package org.aop.main;

import com.alibaba.fastjson.JSON;
import org.aop.dao.MyCalculator;
import org.aop.impl.MyCalculatorImpl;
import org.aop.config.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest_1 {
    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculator myCalculator = ctx.getBean(MyCalculator.class);
        CalculatorProxy calculatorProxy = new CalculatorProxy();
        calculatorProxy.getClass().getMethod("getInstance", MyCalculatorImpl.class);
        System.out.println();
        System.out.println(myCalculator.add(1,2));
    }
}
