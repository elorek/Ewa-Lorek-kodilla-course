package com.kodilla.good.patterns.challenges.food2door;

public class NewProducer2 implements Producer {
    @Override
    public void process(Order order) {
        boolean isBought = true;
        System.out.println("You've just made your first step to make your future orders cheaper." +
                "Just let your friends know about us. The more people you tell, the more discount you get!");
    }

    @Override
    public String inform(User user) {
        return null;
    }
}
