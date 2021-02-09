package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.data.User;

public class MailService implements InformationService{
    @Override
    public void inform(User user) {
        System.out.println("sms was send to " + user);
    }
}
