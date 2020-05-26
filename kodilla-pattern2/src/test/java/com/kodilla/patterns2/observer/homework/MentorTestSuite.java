package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MentorTestSuite {
    @Test
    public void testNotifications() {
        //Given
        TasksLine line1 = new TasksLine();
        TasksLine line2 = new TasksLine();
        TasksLine line3 = new TasksLine();
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        line1.subscribeMentor(mentor1);
        line2.subscribeMentor(mentor1);
        line2.subscribeMentor(mentor2);
        line3.subscribeMentor(mentor2);
        //When
        line1.addTask("Task 1");
        line1.addTask("Task 2");
        line1.addTask("Task 3");
        line2.addTask("Task 1");
        line2.addTask("Task 2");
        line3.addTask("Task 1");
        line3.addTask("Task 2");
        line3.addTask("Task 3");
        line3.addTask("Task 4");
        //Then
        assertEquals(5, mentor1.getUpdateCount());
        assertEquals(6, mentor2.getUpdateCount());
    }
}
