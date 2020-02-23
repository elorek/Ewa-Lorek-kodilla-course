package com.kodilla.good.patterns.challenges.orderservice;

public class SendEmail implements InfoService {
    @Override
    public void inform(User user) {
        System.out.println("Your delivery is in progress.");
    }
}
