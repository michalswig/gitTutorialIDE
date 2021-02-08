package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class ItemPurchaseService implements PurchaseService {
    @Override
    public boolean purchased(User user, Item item, LocalDateTime purchaseTime) {
        System.out.println("Purchased Service accomplished");
        return true;
    }
}
