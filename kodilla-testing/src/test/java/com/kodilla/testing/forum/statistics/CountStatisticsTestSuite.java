package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CountStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics() {
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
}
