package com.plurasight.UI;

public class ScreenPrompter {

    public static void homeScreen() {
        System.out.println("Please make a selection from the following." +
                "\n\t1. New Order" +
                "\n\t2. Exit");
    }

    public static void orderScreen() {
        System.out.println("Please make a selection from the following." +
                "\n\t1. Add Sandwich" +
                "\n\t2. Add Drink" +
                "\n\t3. Add Chips" +
                "\n\t4. Check-Out" +
                "\n\t5. Cancel Order");

    }

    public static void breadPrompter() {

        System.out.println("What Type of Bread would you like? " +
                "\nBread Options: -white\t-wheat\t-rye\t-wrap");
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
        System.out.println("Would you like extra meat? (yes/no)" +
                "\nExtra: 4\" - $0.50,\t 8\" - $1.00,\t 12\" - $1.50");
    }

    public static void regularToppingPrompter(){
        System.out.println("Would you like any of the Regular Toppings?" +
                "\n-lettuce\t-peppers\t-onions\t-tomatoes\t-chillies\t-cucumber\t-pickles\t-guacamole\t-mushrooms");
    }
}
