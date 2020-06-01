package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Book book1 = new Book("Author1", "Title1", 1989, "sign1");
        Book book2 = new Book("Author2", "Title2", 2000, "sign2");
        Book book3 = new Book("Author3", "Title3", 2001, "sign3");
        Book book4 = new Book("Author4", "Title4", 2015, "sign4");
        Book book5 = new Book("Author5", "Title5", 2019, "sign5");

        Set<Book> testSet = new HashSet<>();
        testSet.add(book1);
        testSet.add(book2);
        testSet.add(book3);
        testSet.add(book4);
        testSet.add(book5);
        //When
        int mediana = medianAdapter.publicationYearMedian(testSet);
        //Then
        Assert.assertEquals(2001, mediana);
    }
}
