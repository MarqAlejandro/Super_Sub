package com.plurasight.Ingredient;

import com.plurasight.abstraction.Ingredient;

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
