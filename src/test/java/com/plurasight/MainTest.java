package com.plurasight;

import com.plurasight.item.Chips;
import com.plurasight.abstraction.Item;
import com.plurasight.menu.order;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void addItemToList_ShouldGetTotalPriceOfList() {
       //arrange
        double actualListTotalResult;                //
        double expectedListTotalResult = 4.50;      //price of 3 * 1.50

        //act

        order.orderList.add(new Chips(1.5,"Lays"));                               //this assumes that I go through the procedure of navigating through the menus and adding 3 chip to the List<Item>
        order.orderList.add(new Chips(1.5,"Ruffles"));
        order.orderList.add(new Chips(0.0,"Doritos"));                               //simulates if you were to say no instead
        order.orderList.add(new Chips(1.5,"Fritos"));





        //assert -- to get to this part of the code, one has to press 1. add sandwich when it is
        actualListTotalResult = order.orderList.stream().map(Item::getPrice).reduce(0.0, (accumulator, price2) -> accumulator + price2); //should be at a size of 1

       // System.out.println("expected: " + expectedListTotalResult + "\nactual: " + actualListTotalResult); //show the results of the test

       assertEquals(expectedListTotalResult, actualListTotalResult);


    }

}