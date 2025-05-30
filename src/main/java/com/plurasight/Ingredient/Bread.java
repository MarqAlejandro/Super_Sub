package com.plurasight.Ingredient;

import com.plurasight.abstraction.Ingredient;

//I created this class as a shell in case additional details needed to be added to just the bread

public class Bread extends Ingredient{
    public Bread(String type) {
        super(type);
    }

    public Bread() {
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
