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
public class Customer {
    private int id;
    private String name;
    private ArrayList<ListBorrow> borrow = new ArrayList<>();

    public Customer() {
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
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

    public ArrayList<ListBorrow> getBorrow() {
        return borrow;
    }

    public void setBorrow(ArrayList<ListBorrow> borrow) {
        this.borrow = borrow;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", borrow=" + borrow + '}';
    }

}
