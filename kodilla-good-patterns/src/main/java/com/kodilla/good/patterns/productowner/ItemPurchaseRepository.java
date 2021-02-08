package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class ItemPurchaseRepository implements PurchaseRepository {
    @Override
    public boolean createRental(User user, Item item, LocalDateTime purchaseTime) {
        System.out.println("Repository for item " + item + " was made.");
        return true;
    }
}
