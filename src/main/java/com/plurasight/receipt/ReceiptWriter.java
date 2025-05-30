package com.plurasight.receipt;

import com.plurasight.Item.Sandwich;
import com.plurasight.abstraction.Item;
import com.plurasight.menu.order;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private static final LocalDateTime DATETIME = LocalDateTime.now();
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
    private static String formattedDateTime = DATETIME.format(dateTimeFormatter);

    private static File file = new File("src/main/resources/Receipts/" + formattedDateTime + ".txt");

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
            fileWriter.write(String.format("\nTotal:                  %10.2f\n" ,order.orderList.stream().map(Item::getPrice).reduce(0.0,(accumulator,price) -> accumulator += price)));
            fileWriter.write("************************************\n");
            fileWriter.write("       Thank you, Come Again        ");




            fileWriter.close();

        }
        catch (IOException e){
            System.out.println("File doesn't exist.");
        }

    }

}
