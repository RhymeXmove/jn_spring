package org.aop.component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LogAspectTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculatorImpl myCalculator = ctx.getBean(MyCalculatorImpl.class);
        myCalculator.add(2,4);
        myCalculator.min(2,4);
    }
}
