package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.data.Product;
import com.kodilla.good.patterns.food2door.data.Shop;
import com.kodilla.good.patterns.food2door.data.User;

public class HealthySugarShopService implements OrderService{

    @Override
    public boolean order(User user, Product product, int quantity, Shop shop) {
        if(product != null){
            System.out.println("new order " + user + product + quantity + shop);
            return true;
        } else {
            System.out.println("product not available");
            return false;
        }
    }
}
