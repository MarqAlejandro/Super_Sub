package com.plurasight.ui;

import com.plurasight.ingredient.Bread;
import com.plurasight.ingredient.Topping;
import com.plurasight.item.Chips;
import com.plurasight.item.Drink;
import com.plurasight.item.Sandwich;

import java.util.List;

import static com.plurasight.ui.IngredientPrompter.*;

public class OrderPrompter {
//-------------------------------------------------------------------------------------------for Chips
    public static Chips ChipPrompter(){
        System.out.println("Add 1 bag of Chips for $1.50? (yes/no)\n");

        String UserSelection = InputPrompter.getSingleString();

        if(UserSelection.equalsIgnoreCase("yes")){
            return new Chips(1.50,ChipType());
        }
        else if(UserSelection.equalsIgnoreCase("no")){                  //can be filtered out later
            return new Chips(0, "");
        }
        else{
            System.out.println("Input was neither yes or no, Please try again");
            return ChipPrompter();
        }
    }

    private static String ChipType(){
        System.out.println("Which type of Chips would you like?\n");
        return InputPrompter.getSingleString();
    }

//----------------------------------------------------------------------------------------for Drinks
    public static Drink DrinkPrompter(){
        System.out.println("What size drink would like? (small for $2.00\tmedium for $2.50\tlarge for 3.00)\n\ncancel drink by leaving blank\n");

        String size = InputPrompter.getSingleString();

        if(size.equalsIgnoreCase("small")){
            return new Drink(2.00, DrinkType(), size);
        }
        else if(size.equalsIgnoreCase("medium")){
            return new Drink(2.50, DrinkType(), size);
        }
        else if(size.equalsIgnoreCase("large")){
            return new Drink(3.00, DrinkType(), size);
        }
        else if(size.equalsIgnoreCase("")){                     //can be filtered out later
            return new Drink(0.0,"",size);
        }
        else{
            System.out.println("Input was none of the sizes, Please try again");
            return DrinkPrompter();
        }
    }
    private static String DrinkType(){
        System.out.println("What type of drink would you like?\n");
        return InputPrompter.getSingleString();
    }
//--------------------------------------------------------------------------------------------for Sandwiches

    public static Sandwich SandwichPrompter(){
        System.out.println("What Size Sandwich would you like? (4\", 8\", 12\")");

        int size = InputPrompter.getIntInput();

        if(size == 4){
            Bread bread = BreadType();
            List<Topping> toppingList = Toppings(size);
            boolean isToasted = Toasted();
            double sandwichPrice = 5.50 + toppingPrice(toppingList);
            return new Sandwich("Sub",size,bread, isToasted, toppingList, sandwichPrice);
        }

        else if(size == 8){
            Bread bread = BreadType();
            List<Topping> toppingList = Toppings(size);
            boolean isToasted = Toasted();
            double sandwichPrice = 7.00 + toppingPrice(toppingList);
            return new Sandwich("Sub",size,bread, isToasted, toppingList, sandwichPrice);

        }
        else if(size == 12){
            Bread bread = BreadType();
            List<Topping> toppingList = Toppings(size);
            boolean isToasted = Toasted();
            double sandwichPrice = 8.50 + toppingPrice(toppingList);
            return new Sandwich("Sub",size,bread, isToasted, toppingList, sandwichPrice);
        }
        else{
            System.out.println("Inputted size was not one of the following. Please try again");
            return SandwichPrompter();
        }

    }

    public static double toppingPrice(List<Topping> toppingList){
        return toppingList.stream().map(Topping::getPrice).reduce(0.0,(accumulator,price)-> accumulator += price);
    }


}
