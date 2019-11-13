package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int iD;
    private final String username;
    private final char sex;
    private final LocalDate birthday;
    private final int postsNumber;

    public ForumUser(final int iD, final String username, final char sex, final LocalDate birthday, final int postsNumber) {
        this.iD = iD;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
        this.postsNumber = postsNumber;
    }

    public int getiD() {
        return iD;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostsNumber() {
        return postsNumber;
    }
}
