package com.plurasight.Item;

import com.plurasight.Ingredient.Bread;
import com.plurasight.Ingredient.Topping;
import com.plurasight.abstraction.Item;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Item {
    private int size;
    private Bread bread;
    private List<Topping> toppings = new ArrayList<>();
    private boolean isToasted;


    public Sandwich(String nameBrand, int size, Bread bread, boolean isToasted, List<Topping> toppings, double price) {
        super(price, nameBrand);
        this.size = size;
        this.bread = bread;
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

    public Sandwich(int size, Bread bread, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.isToasted = isToasted;
    }


    public void printToppings(){
        toppings.stream().map(Topping::getType).forEach(System.out::println);
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
