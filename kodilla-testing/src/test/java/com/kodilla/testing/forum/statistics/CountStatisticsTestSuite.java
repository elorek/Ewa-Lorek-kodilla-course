package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics_0_posts() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        Assert.assertEquals(2, countStatistics.getUsersNumber());
        Assert.assertEquals(0, countStatistics.getPostsNumber());
        Assert.assertEquals(100, countStatistics.getCommentsNumber());
        Assert.assertEquals(0, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(50, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(0, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_1000_posts() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(750);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        users.add("user5");
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(5, countStatistics.getUsersNumber());
        Assert.assertEquals(1000, countStatistics.getPostsNumber());
        Assert.assertEquals(750, countStatistics.getCommentsNumber());
        Assert.assertEquals(200, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(150, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(0.75, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_0_comments() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(21);
        when(statisticsMock.commentsCount()).thenReturn(0);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(3, countStatistics.getUsersNumber());
        Assert.assertEquals(21, countStatistics.getPostsNumber());
        Assert.assertEquals(0, countStatistics.getCommentsNumber());
        Assert.assertEquals(7, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(0, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(0, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_less_comments_than_posts() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(35);
        when(statisticsMock.commentsCount()).thenReturn(14);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        users.add("user5");
        users.add("user6");
        users.add("user7");
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(7, countStatistics.getUsersNumber());
        Assert.assertEquals(35, countStatistics.getPostsNumber());
        Assert.assertEquals(14, countStatistics.getCommentsNumber());
        Assert.assertEquals(5, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(2, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(0.4, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_more_comments_than_posts() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(32);
        when(statisticsMock.commentsCount()).thenReturn(260);
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(4, countStatistics.getUsersNumber());
        Assert.assertEquals(32, countStatistics.getPostsNumber());
        Assert.assertEquals(260, countStatistics.getCommentsNumber());
        Assert.assertEquals(8, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(65, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(8.125, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_0_users() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(300);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(0, countStatistics.getUsersNumber());
        Assert.assertEquals(300, countStatistics.getPostsNumber());
        Assert.assertEquals(1500, countStatistics.getCommentsNumber());
        Assert.assertEquals(0, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(0, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(5, countStatistics.getAveragePostComments(), 0.001);
    }

    @Test
    public void testCalculateAdvStatistics_100_users() {
        // Given
        CountStatistics countStatistics = new CountStatistics();
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            users.add("User number " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        // When
        countStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        Assert.assertEquals(100, countStatistics.getUsersNumber());
        Assert.assertEquals(500, countStatistics.getPostsNumber());
        Assert.assertEquals(2000, countStatistics.getCommentsNumber());
        Assert.assertEquals(5, countStatistics.getAverageUsersPosts(), 0.001);
        Assert.assertEquals(20, countStatistics.getAverageUsersComments(), 0.001);
        Assert.assertEquals(4, countStatistics.getAveragePostComments(), 0.001);
    }
}
