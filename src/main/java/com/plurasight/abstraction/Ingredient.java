package com.plurasight.abstraction;

public abstract class Ingredient {
    protected String type;

    public Ingredient(String type) {
        this.type = type;
    }

    public Ingredient() {
    }

    //override methods for all Ingredient
    public abstract String getType();

    public abstract void setType(String type);
}
