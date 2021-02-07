package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User user;
    private Item item;
    private LocalDateTime purchaseTime;

    public PurchaseRequest(User user, Item item, LocalDateTime purchaseTime) {
        this.user = user;
        this.item = item;
        this.purchaseTime = purchaseTime;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }
}
