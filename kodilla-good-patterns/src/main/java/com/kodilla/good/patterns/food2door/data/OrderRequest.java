package com.kodilla.good.patterns.food2door.data;

public class OrderRequest {
    private User user;
    private Product product;
    private Shop shop;
    private int quantity ;

    public OrderRequest(User user, Product product, Shop shop, int quantity) {
        this.user = user;
        this.product = product;
        this.shop = shop;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Shop getShop() {
        return shop;
    }

    public int getQuantity() {
        return quantity;
    }
}
