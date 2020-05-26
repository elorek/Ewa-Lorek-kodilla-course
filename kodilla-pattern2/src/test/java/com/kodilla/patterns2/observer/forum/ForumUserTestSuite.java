package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser jessieEscobar = new ForumUser("Jessie Escobar");
        ForumUser ivonePinkman = new ForumUser("Ivone Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(jessieEscobar);
        javaHelpForum.registerObserver(ivonePinkman);
        javaToolsForum.registerObserver(ivonePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("It's better to use while loop here.");
        javaHelpForum.addPost("Why?");
        javaToolsForum.addPost("Can somebody help me? My SQL doesn't work..");
        javaToolsForum.addPost("I got 'bad credentials' message while logging in");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(5, ivonePinkman.getUpdateCount());
        assertEquals(2, jessieEscobar.getUpdateCount());
    }

}