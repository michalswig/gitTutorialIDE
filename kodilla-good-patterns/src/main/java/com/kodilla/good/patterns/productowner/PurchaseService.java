package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public interface PurchaseService {
    boolean rent(User user, LocalDateTime purchaseTime);
}
