package com.plurasight.menu;

import com.plurasight.ui.ScreenPrompter;
import com.plurasight.ui.InputPrompter;

public class home {

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

        homeScreen();

    }

    public static void homeScreen(){



    }

    private static void exit() {
        System.out.println("Exiting the application, please come again");
        System.exit(0);

    }


}
