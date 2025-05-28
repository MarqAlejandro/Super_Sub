package com.plurasight.Item;

import com.plurasight.abstraction.Item;

public class Drink extends Item {
    public String size;

    public Drink(double price, String nameBrand, String size){
        super(price,nameBrand);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

}
