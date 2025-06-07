package com.plurasight.ingredient;

import com.plurasight.abstraction.Ingredient;

public class Topping extends Ingredient{
    protected double price;
    public Topping(String type, double price) {
        super(type);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
