package com.kodilla.good.patterns.challenges.orderservice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        User user = new User("James", "Thomson");
        LocalDateTime orderDate = LocalDateTime.of(2019, 12, 15, 12, 30);
        Hello hello = new Hello();
        hello.sayHello(user, orderDate);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("book", 35.90, 2));
        productList.add(new Product("pen", 3.00, 5));
        productList.add(new Product("jacket", 354.99, 1));
        productList.add(new Product("shoes", 235.45, 1));
        productList.add(new Product("T-shirt", 30.00, 3));
        productList.add(new Product("backpack", 150 ,1));
        ProductOrderService productOrderService = new ProductOrderService();
        PriceCalculator priceCalculator = new PriceCalculator();
        double totalPrice = 0;
        for(Product product : productList) {
            if(productOrderService.buy(product)) {
                totalPrice += priceCalculator.calculatePrice(product);
            }
        }
        System.out.println("Order total: " + totalPrice);
        SendEmail sendEmail = new SendEmail();
        sendEmail.inform(user);
    }
}
