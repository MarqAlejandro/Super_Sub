package com.plurasight.UI;

import com.plurasight.Item.Chips;

public class OrderPrompter {

    public static Chips ChipPrompter(){
        System.out.println("Add 1 bag of Chips for 1.50? (yes/no)");

        String UserSelection = InputPrompter.getSingleString();

        if(UserSelection.equalsIgnoreCase("yes")){
            return new Chips(1.50);
        }
        else if(UserSelection.equalsIgnoreCase("no")){
            return new Chips(0);
        }
        else{
            System.out.println("Input was neither yes or no, Please try again");
            return ChipPrompter();
        }
    }

}
