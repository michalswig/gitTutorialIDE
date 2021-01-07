package com.kodilla.exception.nullpointer;

public class MessageNotSendException extends NullPointerException{
    public MessageNotSendException(String s) {
        super(s);
    }
}
