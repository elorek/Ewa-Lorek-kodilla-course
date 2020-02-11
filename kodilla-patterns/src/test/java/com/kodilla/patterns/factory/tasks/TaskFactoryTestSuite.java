package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("The driving task is being executed...", driving.executeTask());
        Assert.assertEquals("Take a trip", driving.getTaskName());
        Assert.assertFalse("The task has been executed.", driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("The painting task is being executed...", painting.executeTask());
        Assert.assertEquals("How to paint lesson", painting.getTaskName());
        Assert.assertFalse("The task has been executed", painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("The shopping task is being executed...", shopping.executeTask());
        Assert.assertEquals("Buy", shopping.getTaskName());
        Assert.assertFalse("The task has been executed", shopping.isTaskExecuted());
    }
}
