package com.kodilla.good.patterns.food2door.data;

public class OrderDto {
    private User user;
    private boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }
}
