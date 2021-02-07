package com.kodilla.good.patterns.productowner;

public class Item {

    int itemId;

    public Item(int itemId) {
        this.itemId = itemId;
    }


    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                '}';
    }

}
