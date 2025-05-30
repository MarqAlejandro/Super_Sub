package com.plurasight.UI;

import com.plurasight.Ingredient.Bread;
import com.plurasight.Ingredient.Cheese;
import com.plurasight.Ingredient.Meat;
import com.plurasight.Ingredient.Topping;

import java.util.ArrayList;
import java.util.List;

public class IngredientPrompter {

    protected static Bread BreadType(){
       ScreenPrompter.breadPrompter();
        return new Bread(InputPrompter.getSingleString());
    }

    protected static boolean Toasted(){
        System.out.println("Would you like your Sandwich toasted?");
        return InputPrompter.getBooleanInput();
    }
    //======================================================================================for toppings
    protected static List<Topping> Toppings(int size){
        List<Topping> toppings = new ArrayList<>();

        do {
            toppings.add(MeatPrompter(size));
        }while(addMore());
        do {
            toppings.add(CheesePrompter(size));
        }while(addMore());
        do {
            toppings.add(ToppingPrompter());
        }while(addMore());


        return toppings;
    }

    private static boolean addMore(){
        System.out.println("Would you like to add more?\n");
        String additionalDecision = InputPrompter.getSingleString();

        if(additionalDecision.equalsIgnoreCase("yes")){
            return true;
        }
        else if(additionalDecision.equalsIgnoreCase("no")){
            return false;
        }
        else{
            System.out.println("Input was neither a yes or a no. Please try again");
            return addMore();
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>sub set of toppings - for meats
    private static Topping MeatPrompter(int size){
       ScreenPrompter.meatPrompter();
        System.out.println();

        String meatSelection = InputPrompter.getSingleString();
        if(!meatSelection.isBlank()) {
            if (size == 4) {
                return new Meat(meatSelection, 1.00 + extraMeat(size));
            } else if (size == 8) {
                return new Meat(meatSelection, 2.00 + extraMeat(size));
            } else {
                return new Meat(meatSelection, 3.00 + extraMeat(size));
            }
        }
        else{
            return new Meat("N/A", 0.0);
        }

    }

    private static double extraMeat(int size){
      ScreenPrompter.extraMeatPrompter();
        System.out.println();
        boolean isExtra = InputPrompter.getBooleanInput();
        if(isExtra){
            if(size == 4){
                return 0.50;
            }
            else if(size == 8){
                return 1.00;
            }
            else{
                return 1.50;
            }

        }
        else{
            return 0;
        }
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>sub set of toppings - for cheeses
    private static Topping CheesePrompter(int size){
       ScreenPrompter.cheesePrompter();
        System.out.println();
        String cheeseSelection = InputPrompter.getSingleString();
        if(!cheeseSelection.isBlank()) {
            if (size == 4) {
                return new Cheese(cheeseSelection, 0.75 + extraCheese(size));
            } else if (size == 8) {
                return new Cheese(cheeseSelection, 1.50 + extraCheese(size));
            } else {
                return new Cheese(cheeseSelection, 2.25 + extraCheese(size));
            }
        }
        else{
            return new Cheese("N/A",0.0);
        }

    }

    private static double extraCheese(int size){
      ScreenPrompter.extraCheesePrompter();
        System.out.println();
        boolean isExtra = InputPrompter.getBooleanInput();
        if(isExtra){
            if(size == 4){
                return 0.30;
            }
            else if(size == 8){
                return 0.60;
            }
            else{
                return 0.90;
            }

        }
        else{
            return 0;
        }
    }

    private static Topping ToppingPrompter(){
       ScreenPrompter.regularToppingPrompter();
        return new Topping(InputPrompter.getSingleString(),0.0);
    }

}
