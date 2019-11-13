package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Friendship", (someText) -> toUpperCase(someText));
        poemBeautifier.beautify("Memories", (someText) -> someText + " from my London tour");
        poemBeautifier.beautify("Happines", (someText) -> someText + '\u00A9');
        poemBeautifier.beautify("Dream", (someText) -> someText + "\nbig");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }

}
