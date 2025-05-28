package com.plurasight;

import com.plurasight.abstraction.Item;
import com.plurasight.menu.home;
import com.plurasight.menu.order;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    public static void main(String[] args) {
       //arrange
        double actualListSizeResult;                //
        double expectedListSizeResult = 4.50;      //price of 3 * 1.50

        //act
        home.start();                               //this assumes that I go through the procedure of navigating through the menus and adding 1 chip to the List<Item>

                                                    //also did a test where i messed up the input of yes, it creates an object with 0 value that will not add anything to the total

        //assert -- to get to this part of the code, one has to press 1. add sandwich when it is
        actualListSizeResult = order.orderList.stream().map(Item::getPrice).reduce(0.0, (accumulator, price2) -> accumulator + price2); //should be at a size of 1

        System.out.println("expected: " + expectedListSizeResult + "\nactual: " + actualListSizeResult); //show the results of the test

        assertEquals(expectedListSizeResult, actualListSizeResult);


    }

}