package com.kodilla.good.patterns.challenges.orderservice;

public class User {
    String userName;
    String userSurname;

    public User(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
}
