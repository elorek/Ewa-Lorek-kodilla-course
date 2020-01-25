package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorRunnerTestSuite {
    @Test
    public void testCalculations() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator)context.getBean("calculator");
        // When
        double result1 = calculator.add(5.5, 2);
        double result2 = calculator.sub(10,2);
        double result3 = calculator.mul(8,6);
        double result4 = calculator.div(20, 4);
        // Then
        Assert.assertEquals(7.5, result1, 0.001);
        Assert.assertEquals(8, result2, 0.001);
        Assert.assertEquals(48, result3, 0.001);
        Assert.assertEquals(5, result4, 0.001);
    }
}
