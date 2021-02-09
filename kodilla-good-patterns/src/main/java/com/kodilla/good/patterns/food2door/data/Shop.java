package com.kodilla.good.patterns.food2door.data;

public class Shop {
    private String brandName;

    public Shop(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "brandName='" + brandName + '\'' +
                '}';
    }
}
