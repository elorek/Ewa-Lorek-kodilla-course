package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;

public class Hello implements HelloInfo {
    @Override
    public void sayHello(User user, LocalDateTime orderDate) {
        System.out.println("Hello, " + user.getUserName() + " " + user.getUserSurname() + "! " + "Your order, made on " +
                orderDate.toString() + ", " + "contains: ");
    }
}
