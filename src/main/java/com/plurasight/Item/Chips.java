package com.plurasight.Item;

import com.plurasight.abstraction.Item;

public class Chips extends Item {
    public Chips(double price, String type) {
        super(price, type);
    }

    @Override
    public String getType(){
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
