/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Ryuu
 */
public class ListBorrow {
    private Book book;
    private Customer customer;
    private Date dateBorrow;
    private String dateBack;

    public ListBorrow() {
    }

    public ListBorrow(Book book, Customer customer, Date dateBorrow, String dateBack) {
        this.book = book;
        this.customer = customer;
        this.dateBorrow = dateBorrow;
        this.dateBack = dateBack;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getDateBorrow() {
        return dateBorrow;
    }

    public void setDateBorrow(Date dateBorrow) {
        this.dateBorrow = dateBorrow;
    }

    public String getDateBack() {
        return dateBack;
    }

    public void setDateBack(String dateBack) {
        this.dateBack = dateBack;
    }

    @Override
    public String toString() {
        return "ListBorrow{" + "book=" + book + ", customer=" + customer + ", dateBorrow=" + dateBorrow + ", dateBack=" + dateBack + '}';
    }

}
