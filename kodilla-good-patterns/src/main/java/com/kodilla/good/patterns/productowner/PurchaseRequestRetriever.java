package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {
        User user = new User("John", "Doe");
        LocalDateTime purchaseTime = LocalDateTime.of(2020,  3, 23, 12,0);
        Item item = new Item(21);
        return new PurchaseRequest(user, item, purchaseTime);
    }



}
