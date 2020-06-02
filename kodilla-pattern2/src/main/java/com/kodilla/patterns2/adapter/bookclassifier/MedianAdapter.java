package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = bookSet.stream()
                .collect(Collectors.toMap(bLib -> new BookSignature(bLib.getSignature()),
                bLib -> new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(bLib.getTitle(), bLib.getAuthor(),
                        bLib.getPublicationYear())));
        return medianPublicationYear(bookMap);
    }
}
