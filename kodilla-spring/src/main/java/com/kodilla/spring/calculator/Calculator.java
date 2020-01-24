package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    public double add(double a, double b) {
        double result1 = a + b;
        display.displayValue(7.5);
        return result1;
    }

    public double sub(double a, double b) {
        double result2 = a - b;
        display.displayValue(8);
        return result2;
    }

    public double mul(double a, double b) {
        double result3 = a * b;
        display.displayValue(48);
        return result3;
    }

    public double div(double a, double b) {
        double result4 = a / b;
        display.displayValue(5);
        return result4;
    }

}
