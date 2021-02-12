package com.kodilla.good.patterns.food2door.logic.interfaces;

import com.kodilla.good.patterns.food2door.data.Product;
import com.kodilla.good.patterns.food2door.data.Shop;
import com.kodilla.good.patterns.food2door.data.User;

public class HealthySugarShopRepository implements OrderRepository {
    @Override
    public boolean createOrder(User user, Product product, int quantity, Shop shop) {
        if (product != null) {
            System.out.println("New repository was created: " + user + ", " + product + ", " + shop + ".");
            return true;
        } else {
            System.out.println("Nothing added to repository");
            return false;
        }
    }
}
