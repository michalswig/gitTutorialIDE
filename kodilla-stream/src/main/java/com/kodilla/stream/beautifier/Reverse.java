package com.kodilla.stream.beautifier;

public class Reverse implements PoemDecorator{

    @Override
    public String decorate(String text) {
        int i, len = text.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(text.charAt(i));
        }

        return dest.toString();
    }

}
