package com.kodilla.good.patterns.food2door.logic.interfaces;

import com.kodilla.good.patterns.food2door.data.Product;
import com.kodilla.good.patterns.food2door.data.Shop;
import com.kodilla.good.patterns.food2door.data.User;

public interface OrderRepository {
    boolean createOrder(User user, Product product, int quantity, Shop shop);
}
