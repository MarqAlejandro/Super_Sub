package com.plurasight.receipt;

import com.plurasight.item.Sandwich;
import com.plurasight.abstraction.Item;
import com.plurasight.menu.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static final LocalDateTime DATETIME = LocalDateTime.now();
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
    private static String formattedDateTime = DATETIME.format(dateTimeFormatter);

    private static File file = new File(Paths.get("Receipts") + formattedDateTime + ".txt");

    public static void printReceipt(){                                  //constructs a receipt in a .txt file

        try {
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("""
                                 super(Sub)
                                 
                         Address: 1234 New York, NY
                              Tel: 123-456-7890
                              
                    ************************************
                                   RECEIPT
                    ************************************
                    
                    Item                           Price
                    """);

            for(Item order : order.orderList){
                fileWriter.write(String.format("%-10s              %10.2f\n",order.getType(), order.getPrice()));
                if(order instanceof Sandwich){
                    if(((Sandwich) order).isToasted()){
                        fileWriter.write(String.format("%s\" on %s - ",((Sandwich)order).getSize(),((Sandwich)order).getBread().getType()));
                        fileWriter.write("Toasted\n");
                    }
                    else{
                        fileWriter.write(String.format("%s\" on %s - \n",((Sandwich)order).getSize(),((Sandwich)order).getBread().getType()));
                    }
                    fileWriter.write(((Sandwich) order).writeToppings().toString());
                }
            }

            fileWriter.write("------------------------------------");
                                                                                    //can improve by making a pricing class
            fileWriter.write(String.format("\nTotal:                  %10.2f\n" ,order.orderList.stream().map(Item::getPrice).reduce(0.0,(accumulator,price) -> accumulator += price)));
            fileWriter.write("************************************\n");
            fileWriter.write("       Thank you, Come Again        ");


            /*

             public static void printReceipt(Order order) { // It accepts a completed Order object
        // The file naming logic remains the same
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String timestamp = now.format(formatter);
        File file = new File("receipts/" + timestamp + ".txt");

        try (FileWriter writer = new FileWriter(file)) { // Using try-with-resources is safer

            writer.write("    super(Sub)\n");
            writer.write("    Address: 1234 New York, NY\n");
            writer.write("    Tel: 123-456-7890\n");
            writer.write("************************************\n");
            writer.write("             RECEIPT\n");
            writer.write("************************************\n\n");
            writer.write(String.format("%-25s %10s\n", "Item", "Price"));
            writer.write("------------------------------------\n");

            // It gets the list of items directly FROM the order object.
            for (Item item : order.getItems()) {
                // It trusts the price that was stored IN the item object at the time of creation.
                // It does NOT call the PricingCalculator.
                writer.write(String.format("%-25s %10.2f\n", item.getType(), item.getPrice()));

                // This detailed sandwich logic is fine here, as it's purely for formatting.
                if (item instanceof Sandwich) {
                    Sandwich sandwich = (Sandwich) item;
                    writer.write(String.format("  - %d\" on %s Bread%s\n",
                            sandwich.getSize(),
                            sandwich.getBread().getType(),
                            sandwich.isToasted() ? " (Toasted)" : ""
                    ));
                    writer.write(sandwich.writeToppings().toString()); // Assumes writeToppings formats nicely
                }
            }

            writer.write("------------------------------------\n");
            // It gets the final total FROM the order object. It doesn't recalculate it here.
            writer.write(String.format("%-25s %10.2f\n", "Total:", order.getTotalPrice()));
            writer.write("************************************\n");
            writer.write("      Thank you, Come Again!\n");

        } catch (IOException e) {
            System.out.println("ERROR: Could not write receipt file.");
            e.printStackTrace();
        }
    }
}
             */



            fileWriter.close();

        }
        catch (IOException e){
            System.out.println("File doesn't exist.");
        }

    }

}
