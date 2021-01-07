package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {

    public static void main(String[] args) {
        User user = null;
        MessageSender messageSender = new MessageSender();
        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch(NullPointerException e) {
            System.out.println("Hello there was a mistake but it works anyway ;) DETAILS: " + e);
        } finally {
            System.out.println("marry go round");
        }


    }

}
