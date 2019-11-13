package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String someText, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(someText);
    }
}
