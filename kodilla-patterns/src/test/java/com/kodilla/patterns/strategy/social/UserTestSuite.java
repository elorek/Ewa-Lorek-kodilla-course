package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User arthur = new Millenials("arthur");
        User john = new YGeneration("john");
        User ashley = new ZGeneration("ashley");
        //When
        String publisherForArthur = arthur.sharePost();
        System.out.println("Arthur should use: " + publisherForArthur);
        String publisherForJohn = john.sharePost();
        System.out.println("John should use: " + publisherForJohn);
        String publisherForAshley = ashley.sharePost();
        System.out.println("Ashley should use: " + publisherForAshley);
        //Then
        Assert.assertEquals("Facebook", publisherForArthur);
        Assert.assertEquals("Twitter", publisherForJohn);
        Assert.assertEquals("Snapchat", publisherForAshley);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User arthur = new Millenials("arthur");
        //When
        String publisherForArthur = arthur.sharePost();
        System.out.println("Arthur should use: " + publisherForArthur);
        arthur.setSocialPublisher(new SnapchatPublisher());
        publisherForArthur = arthur.sharePost();
        System.out.println("Arthur should use now: " + publisherForArthur);
        //Then
        Assert.assertEquals("Snapchat", publisherForArthur);
    }
}
