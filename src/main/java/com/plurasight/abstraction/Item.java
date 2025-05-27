package com.plurasight.abstraction;

public abstract class Item {
    protected double price;
    protected int itemID;

    public Item(double price, int itemID) {
        this.price = price;
        this.itemID = itemID;
    }

    public Item() {

    }

    public abstract double getPrice();            //made abstract so that all items have to override

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
