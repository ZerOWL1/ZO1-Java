/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryuu
 */
public class GroceryBill {
    /** Declare Grocery Bill variables
     * 
     */
    private double total;
    private List<Item> items;
    private Employee clerk;

    public GroceryBill(Employee clerk) {
        this.total = 0.0;
        this.items = new ArrayList<>();
        this.clerk = clerk;
    }
    
    public void add(Item i){
        items.add(i);
        total += i.getPrice();
    }
    
    public double getTotal(){
        return total;
    }

     public Employee getClerk() {
        return clerk;
    }
    
    public List<Item> getItems() {
        return items;
    }

    public void printReceipt(){
        System.out.println("List of items: ");
        for (Item item : items) {
            System.out.println("\t" + item.toString());
        }
    }
}
