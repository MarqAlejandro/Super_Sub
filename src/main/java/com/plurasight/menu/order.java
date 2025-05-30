package com.plurasight.menu;

import com.plurasight.UI.InputPrompter;
import com.plurasight.UI.OrderPrompter;
import com.plurasight.UI.ScreenPrompter;
import com.plurasight.abstraction.Item;

import java.util.ArrayList;
import java.util.List;

public class order {

    public static List<Item> orderList = new ArrayList<>();



    public static void orderScreen(){
        ScreenPrompter.orderScreen();
        int OrderScreenSelection = InputPrompter.getIntInput();

        switch (OrderScreenSelection) {
            case 1:
                orderList.add(OrderPrompter.SandwichPrompter());
                orderScreen();
                break;
            case 2:
                orderList.add(OrderPrompter.DrinkPrompter());
                orderScreen();
                break;
            case 3:
                orderList.add(OrderPrompter.ChipPrompter());
                orderScreen();
                break;
            case 4:
                checkout.checkoutScreen();
                break;
            case 5:
                System.out.println("Traveling to Home Screen...");
                orderList.clear();
                home.homeScreen();
                break;
            default:
                System.out.println("Input was not one of the following. Please Try Again");
                orderScreen();
        }



    }
}
