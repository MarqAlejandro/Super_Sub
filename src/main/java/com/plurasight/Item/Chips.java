package com.plurasight.Item;

import com.plurasight.abstraction.Item;

public class Chips extends Item {
    public Chips(double price) {
        super(price);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
