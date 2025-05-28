package com.plurasight.UI;

import com.plurasight.Item.Chips;
import com.plurasight.Item.Drink;

public class OrderPrompter {

    public static Chips ChipPrompter(){
        System.out.println("Add 1 bag of Chips for 1.50? (yes/no)");

        String UserSelection = InputPrompter.getSingleString();

        if(UserSelection.equalsIgnoreCase("yes")){
            return new Chips(1.50,ChipType());
        }
        else if(UserSelection.equalsIgnoreCase("no")){
            return new Chips(0, "");
        }
        else{
            System.out.println("Input was neither yes or no, Please try again");
            return ChipPrompter();
        }
    }

    public static String ChipType(){
        System.out.println("Which brand of Chips would you like?");
        return InputPrompter.getSingleString();
    }


    public static Drink DrinkPrompter(){
        System.out.println("What size drink would like? (small/medium/large");

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
        else{
            System.out.println("Input was none of the sizes, Please try again");
            return DrinkPrompter();
        }
    }
    public static String DrinkType(){
        System.out.println("What type of drink would you like?");
        return InputPrompter.getSingleString();
    }

}
