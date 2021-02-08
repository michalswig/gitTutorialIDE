package com.kodilla.good.patterns.productowner;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Mail was send to" + user);
    }
}
