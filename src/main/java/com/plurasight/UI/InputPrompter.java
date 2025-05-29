package com.plurasight.UI;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputPrompter {

    public static String getSingleString(){                     //prompt the user for input, returns a String
        String singleString = "";
        try {
            System.out.print("Enter: ");
            Scanner scanner = new Scanner(System.in);
            singleString = scanner.nextLine().trim().toLowerCase();
            System.out.println();

            return singleString;
        } catch (Exception e) {
            System.out.println("somehow an error with a String Variable. Please try again");
            return getSingleString();
        }
    }

    public static int getIntInput(){                            //using the getSingleString() method, assuming its correct, it parses the String into an int
        int convertedStringToInt = 0;
        try{
            convertedStringToInt = Integer.parseInt(getSingleString());

            return convertedStringToInt;
        }
        catch (InputMismatchException e){
            System.out.println("String Input Failed to Convert, most like due to it not being a number. Please try again");
            return getIntInput();
        }
    }

    public static double getDoubleInput(){                    //using the getSingleString() method, assuming its correct, it parses the String into a double
        double convertedStringToDouble = 0;
        try{
            convertedStringToDouble = Double.parseDouble(getSingleString());

            return convertedStringToDouble;
        }
        catch (InputMismatchException e){
            System.out.println("String Input Failed to Convert, most like due to it not being a number. Please try again");
            return getDoubleInput();
        }

    }

    public static boolean getBooleanInput(){
        try{
            String UserInput = getSingleString();
            if(UserInput.equalsIgnoreCase("yes")) {
                return true;
            }
            else if(UserInput.equalsIgnoreCase("no")){
                return false;
            }
            else{
                System.out.println("Input is neither a yes or a no. Please try again");
                return getBooleanInput();
            }

        }
        catch (Exception e){
            System.out.println("String Input Failed to Convert, Please check your input.");
            return getBooleanInput();
        }

    }



}
