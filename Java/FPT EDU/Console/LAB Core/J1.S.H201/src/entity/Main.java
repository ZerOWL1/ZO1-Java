/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Scanner;

/**
 *
 * @author Ryuu
 */
public class Main {
    private static final Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
        Item apple = new Item("Apple", 150.0, 25.0);
        Item orange = new Item("Orange", 400.0, 0.0);
        Item banana = new Item("Banana", 350.0, 50.0);
        
        //Declare new Employee obj
        Employee e = new Employee("Haild");
        
        //Start create discount bill
        DiscountBill bill = new DiscountBill(e, true);
        
        //Add Bill
        bill.add(apple);
        bill.add(orange);
        bill.add(banana);
        
        //print receipt
        bill.printReceipt();
        
        
        /** 1. Add Item - Add Items to List
         *  2. Declare user
         *  3. Declare bill - true or false (preferred or not)
         *  4. Add user depend on bill? 
         */
        
        
        System.out.println("Number of discount: " + bill.getDiscountCount());
        System.out.println("Amount of discount: " + bill.getDiscountAmount());
        System.out.println("Percent discount: " + bill.getDiscountPercent() + "%");
        System.out.println("Amount money "+e.getName()+" should to Pay: " + bill.getTotal());
        
    }
    
}
