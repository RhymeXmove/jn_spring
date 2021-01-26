package org.aop.component;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

public class LogAspectTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculatorImpl myCalculator = ctx.getBean(MyCalculatorImpl.class);
        myCalculator.add(2,4);
        myCalculator.min(2,4);
    }

    @Test
    @Transactional
    public void transactional() {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(JavaConfig.class);
        MyCalculatorImpl myCalculator = ctx.getBean(MyCalculatorImpl.class);
        myCalculator.add(2,4);
        myCalculator.min(-1,4);
    }

}
