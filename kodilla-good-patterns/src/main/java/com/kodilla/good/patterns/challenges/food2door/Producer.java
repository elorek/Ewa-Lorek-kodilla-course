package com.kodilla.good.patterns.challenges.food2door;

public interface Producer {
    void process(Order order);
    default String inform(User user) {
        return "Hello, " + user.getUserName() + " " + user.getUserSurname() + "! " + "Your order has been completed!";
    }
}
