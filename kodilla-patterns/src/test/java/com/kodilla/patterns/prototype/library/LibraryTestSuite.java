package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() throws CloneNotSupportedException {
        //Given
        Library library1 = new Library("NewLibrary");
        library1.getBooks().add(new Book("T1", "A1", LocalDate.now()));
        library1.getBooks().add(new Book("T2", "A2", LocalDate.now()));
        //When
        Library library2 = library1.deepCopy();
        //Then
        library1.getBooks().add(new Book("T3", "A3", LocalDate.now()));
        Assert.assertEquals(2, library2.getBooks().size());
    }
}
