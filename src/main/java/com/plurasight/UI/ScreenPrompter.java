package com.plurasight.UI;

import com.plurasight.Item.Sandwich;
import com.plurasight.abstraction.Item;
import com.plurasight.menu.order;

public class ScreenPrompter {

    public static void homeScreen() {
        System.out.println("Please make a selection from the following." +
                "\n\t1. New Order" +
                "\n\t2. Exit\n");
    }

    public static void orderScreen() {
        System.out.println("Please make a selection from the following." +
                "\n\t1. Add Sandwich" +
                "\n\t2. Add Drink" +
                "\n\t3. Add Chips" +
                "\n\t4. Check-Out" +
                "\n\t5. Cancel Order\n");

    }
//--------------------------------------------------------------------------------------ingredient Screen prompters from order screen
    public static void breadPrompter() {

        System.out.println("What Type of Bread would you like? " +
                "\n\t-white\t-wheat\t-rye\t-wrap");
    }

    public static void meatPrompter(){
        System.out.println("What kind of meat would you like?" +
                "\n\t-steak\t-ham\t-salami\t-roast beef\t-chicken\t-bacon" +
                "\nFor No Meat option, leave it blank");
    }

    public static void extraMeatPrompter(){
        System.out.println("Would you like extra meat? (yes/no)" +
                "\n\t4\" - $0.50,\t8\" - $1.00,\t12\" - $1.50");
    }

    public static void cheesePrompter(){
        System.out.println("What kind of Cheese would you like?" +
                "\n\t-american\t-provolone\t-cheddar\t-swiss" +
                "\nFor No Cheese, leave it blank");
    }

    public static void extraCheesePrompter(){
        System.out.println("Would you like extra cheese? (yes/no)" +
                "\n\t4\" - $0.50,\t 8\" - $1.00,\t 12\" - $1.50");
    }

    public static void regularToppingPrompter(){
        System.out.println("Would you like any of the Regular Toppings, Sauces, or Sides?" +
                "\n\tToppings:" +
                "\n-lettuce\t-peppers\t-onions\t-tomatoes\t-chillies\t-cucumber\t-pickles\t-guacamole\t-mushrooms" +
                "\n\n\tSauces:" +
                "\n-mayo\t-mustard\t-ketchup\t-ranch\t-thousand island\t-vinaigrette" +
                "\n\n\tSides:" +
                "\n-au jus\t-sauce\n");
    }

//------------------------------------------------------------------------------------------Check out screen

    public static void orderDetailScreen(){
        System.out.println("Order Details: ");
        for(Item order : order.orderList){
            System.out.print((String.format("%-10s              %10.2f\n",order.getType(), order.getPrice())));
            if(order instanceof Sandwich){
                if(((Sandwich) order).isToasted()){
                    System.out.print(String.format("%s on %s - ",((Sandwich)order).getSize(),((Sandwich)order).getBread().getType()));
                    System.out.println("Toasted");
                }
                else{
                    System.out.println(String.format("%n on %s -",((Sandwich)order).getSize(),((Sandwich)order).getBread().getType()));
                    System.out.println("-----------------------------------");
                }
                System.out.print(((Sandwich) order).writeToppings().toString());
            }
        }
        System.out.print(String.format("\nTotal:                  %10.2f\n" ,order.orderList.stream().map(Item::getPrice).reduce(0.0,(accumulator,price) -> accumulator += price)));

    }
    public static void checkoutScreen(){
        System.out.println("Please make a selection from the following." +
                           "\n\t1. Confirm\t\t2. Cancel");
    }
}
