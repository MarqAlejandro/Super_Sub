package com.plurasight.Item;

import com.plurasight.abstraction.Item;

public class Drink extends Item {
    public String size;

    public Drink(double price, String type, String size){
        super(price,type);
        this.size = size;
    }

    @Override
    public String getType(){
        return size + " " + type;
    }



    @Override
    public double getPrice() {
        return price;
    }

}
