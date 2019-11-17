package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(12345, "user1", 'M', LocalDate.of(1980, 3, 28), 10));
        userList.add(new ForumUser(54321, "user2", 'M', LocalDate.of(1975, 6, 29), 0));
        userList.add(new ForumUser(12543, "user3", 'F', LocalDate.of(1983, 4, 15), 340));
        userList.add(new ForumUser(32415, "user4", 'F', LocalDate.of(2000, 11, 18), 150));
        userList.add(new ForumUser(45312, "user5", 'M', LocalDate.of(1965, 8, 11), 200));
        userList.add(new ForumUser(24513, "user6", 'F', LocalDate.of(1988, 1, 28), 0));
        userList.add(new ForumUser(23415, "user7", 'F', LocalDate.of(2003, 7, 5), 58));
        userList.add(new ForumUser(14253, "user8", 'M', LocalDate.of(2005, 12, 18), 350));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
