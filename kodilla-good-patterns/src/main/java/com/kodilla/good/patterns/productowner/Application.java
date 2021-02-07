package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        User user = new User("John", "Doe");
        LocalDateTime purchaseTime = LocalDateTime.of(2020,  3, 23, 12,0);


        ProductOrderService productOrderService = new ProductOrderService();
        boolean isBought = productOrderService.purchased(user, purchaseTime);




        if(isBought){

        } else {

        }


    }

}
