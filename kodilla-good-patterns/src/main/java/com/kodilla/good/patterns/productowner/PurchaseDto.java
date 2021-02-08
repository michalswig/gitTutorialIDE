package com.kodilla.good.patterns.productowner;

public class PurchaseDto {

    public User user;
    public Item item;
    public boolean isBought;

    public PurchaseDto(User user, Item item, boolean isBought) {
        this.user = user;
        this.isBought = isBought;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }

    public Item getItem() {
        return item;
    }
}
