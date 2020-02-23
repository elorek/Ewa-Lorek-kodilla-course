package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    final String username;

    public ForumUser() {
        this.username = "John Smith"; //przekazanie wartosci na sztywno w konstruktorze bezargumentowym (puste())
    }

    public String getUsername() {
        return username;
    }
}
