package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {
        User user = new User("John", "Doe");
        LocalDateTime purchaseTime = LocalDateTime.of(2021, 1, 15, 13, 23);
        Item item = new Item(21097);
        return new PurchaseRequest(user, item, purchaseTime);
    }

}
