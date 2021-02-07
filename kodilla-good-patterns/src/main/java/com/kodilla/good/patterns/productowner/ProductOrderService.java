package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class ProductOrderService {

    public boolean purchased(User user, Item item, LocalDateTime purchaseTime){
        System.out.println("Item bought by : " + user.getName() + user.getSurname()
                + " at " + purchaseTime.toString());
        return true;
    }

}
