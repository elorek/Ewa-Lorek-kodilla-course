package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;



public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("Friendship", (someText) -> someText.toUpperCase()));
        System.out.println(poemBeautifier.beautify("Memories", (someText) -> someText + " from my London tour"));
        System.out.println(poemBeautifier.beautify("Happines", (someText) -> someText + "\u00A9"));
        System.out.println(poemBeautifier.beautify("Dream", (someText) -> someText + "\nbig"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .filter(s -> s.length() > 11)
                //.map(s -> s.toUpperCase()) // lub .map(String::toUpperCase)
                .forEach(System.out::println); // lub .forEach(s -> System.out.println(s))
    }

}
