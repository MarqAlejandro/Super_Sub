package com.plurasight.abstraction;

public abstract class Item {
    protected double price;
    //protected int itemID;
    protected String nameBrand;   //can be used for specific brands

    public Item(double price, int itemID, String nameBrand) {
        this.price = price;
        //this.itemID = itemID;
        this.nameBrand = nameBrand;
    }

    public Item(double price, String nameBrand){
        this.price = price;
        this.nameBrand = nameBrand;
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

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }
}
