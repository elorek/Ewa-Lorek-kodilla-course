package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CountStatistics {
    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averageUsersPosts;
    private double averageUsersComments;
    private double averagePostComments;



    public void calculateAdvStatistics(Statistics statistics) {
        usersNumber = statistics.usersNames().size();
        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();
        averageUsersPosts = usersNumber / postsNumber;
        averageUsersComments = usersNumber / commentsNumber;
        averagePostComments = postsNumber / commentsNumber;
    }

    public int getUsersNumber() {
        return usersNumber;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getCommentsNumber() {
        return commentsNumber;
    }

    public double getAverageUsersPosts() {
        return averageUsersPosts;
    }

    public double getAverageUsersComments() {
        return averageUsersComments;
    }

    public double getAveragePostComments() {
        return averagePostComments;
    }
}
