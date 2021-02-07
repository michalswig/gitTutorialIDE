package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public interface PurchaseRepository {
    boolean createRental(User user, Item item, LocalDateTime purchaseTime);
}
