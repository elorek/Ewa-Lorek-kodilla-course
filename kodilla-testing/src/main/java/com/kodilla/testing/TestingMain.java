package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();
        int result2 = calculator.add(12, 5);
        int result3 = calculator.substract(12, 5);
        if (result2 == 17 && result3 == 7) {
            System.out.println("Adding and substraction work correctly.");
        } else {
            System.out.println("Something is wrong.");
        }
    }
}

