package com.plurasight;

import com.plurasight.menu.home;
import com.plurasight.menu.order;
import com.plurasight.ui.InputPrompter;
import com.plurasight.ui.ScreenPrompter;

import static com.plurasight.menu.home.homeScreen;

public class Application {

    public void start(){

        System.out.println("Hello User, Welcome to " +
                "\n" +
                "                            _ __                            / /              ___            _                \\ \\    \n" +
                "            ___    _  _    | '_ \\   ___      _ _           | |              / __|   _  _   | |__              | |     \n" +
                "           (_-<   | +| |   | .__/  / -_)    | '_|          | |              \\__ \\  | +| |  | '_ \\             | |   \n" +
                "   _____   /__/_   \\_,_|   |_|__   \\___|   _|_|_   _____   _\\_\\_   _____    |___/   \\_,_|  |_.__/  _____   _/_/_  \n" +
                "  |\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"|_|\"\"\"\"\"| \n" +
                " \"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-'\"`-0-0-' \n"
        );
    boolean isRunning = true;

    while(isRunning)
    {
        ScreenPrompter.homeScreen();
        int HomeScreenSelection = InputPrompter.getIntInput();

        switch (HomeScreenSelection) {
            case 1:
                order.orderScreen();
                break;
            case 2:
                exit();
                break;
            default:
                System.out.println("Input was not one of the following. Please Try Again");
                homeScreen();

        }


        }
        homeScreen();

    }
}
