package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String someText, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(someText);
    }
}
