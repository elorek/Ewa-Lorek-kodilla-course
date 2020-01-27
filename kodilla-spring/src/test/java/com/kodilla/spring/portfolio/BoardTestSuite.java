package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Autowired
    @Qualifier("getToDoList")
    private TaskList toDoList;
    @Test
    public void testCreateBoard() {
        // Given, When
        board.getToDoList().getTasks().add("Test");
        // Then
        Assert.assertEquals(1, toDoList.getTasks().size());
    }
}