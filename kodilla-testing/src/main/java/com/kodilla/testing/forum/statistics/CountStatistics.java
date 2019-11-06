package com.kodilla.testing.forum.statistics;

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
        if (postsNumber != 0) {
            averagePostComments = commentsNumber / (double) postsNumber;
        } else {
            averagePostComments = 0;
        }
        if (usersNumber != 0) {
            averageUsersComments = commentsNumber / (double) usersNumber;
            averageUsersPosts = postsNumber / (double) usersNumber;
        } else {
            averageUsersComments = 0;
            averageUsersPosts = 0;
        }
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
