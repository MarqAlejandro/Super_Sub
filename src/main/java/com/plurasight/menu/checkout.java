package com.plurasight.menu;


import com.plurasight.UI.InputPrompter;
import com.plurasight.UI.ScreenPrompter;

import com.plurasight.receipt.ReceiptWriter;

public class checkout {

    public static void checkoutScreen(){
        ScreenPrompter.orderDetailScreen();
        ScreenPrompter.checkoutScreen();
        int checkoutScreenSelection = InputPrompter.getIntInput();

        switch (checkoutScreenSelection){
            case 1:
                System.out.println("Order has been received." +
                        "\nTo get your receipt, please exit the program." +
                        "\nTraveling back to the Home Screen.");
                ReceiptWriter.printReceipt();
                order.orderList.clear();
                home.start();
                break;
            case 2:
                System.out.println("Order has been cancelled, Traveling back to the Home Screen.");
                order.orderList.clear();
                home.start();
                break;
            default:
                System.out.println("input was not 1 or 2, please try again");
                checkoutScreen();

        }
    }
}
