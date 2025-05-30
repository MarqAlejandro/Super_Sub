package com.plurasight.abstraction;

public abstract class Item {
    protected double price;
    //protected int itemID;
    protected String type;

   /* public Item(double price, int itemID, String nameBrand) {                     //wanted to implement an item cataloging system. but didn't have time
        this.price = price;
        //this.itemID = itemID;
        this.nameBrand = nameBrand;
    }

    */

    public Item(double price, String type){
        this.price = price;
        this.type = type;
    }

    public Item() {

    }

    public abstract double getPrice();            //made abstract so that all items have to override

    public void setPrice(double price) {
        this.price = price;
    }

    /*public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

     */

    public abstract String getType();

    public void setType(String type) {
        this.type = type;
    }
}
