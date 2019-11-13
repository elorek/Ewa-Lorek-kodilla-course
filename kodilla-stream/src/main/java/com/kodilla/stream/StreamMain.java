package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Friendship", (someText) -> toUpperCase(someText));
        poemBeautifier.beautify("Memories", (someText) -> someText + " from my London tour");
        System.out.println(poemBeautifier.beautify("Happiness", (someText) -> someText + '\u00A9'));
        poemBeautifier.beautify("Dream", (someText) -> someText + "\nbig");
    }

}
