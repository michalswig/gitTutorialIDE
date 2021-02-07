package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public interface PurchaseService {
    public boolean purchased(User user, Item item, LocalDateTime purchaseTime);
}
