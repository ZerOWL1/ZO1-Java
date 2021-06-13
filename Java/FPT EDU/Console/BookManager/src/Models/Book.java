/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author Ryuu
 */
public class Book {
    private int id;
    private String name;
    private double price;
    private ArrayList<ListBorrow> borrow = new ArrayList<>();
    

    public Book() {
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<ListBorrow> getBorrow() {
        return borrow;
    }

    public void setBorrow(ArrayList<ListBorrow> borrow) {
        this.borrow = borrow;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", price=" + price + ", borrow=" + borrow + '}';
    }
    
}
