package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.data.*;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        User user = new User("John", "Doe");
        Product product = new Bananas("bananas", 5.50);
        Shop shop = new HealthySugarShop("Healthy Sugar shop");

        return new OrderRequest(user, product, shop, 2);
    }

}
