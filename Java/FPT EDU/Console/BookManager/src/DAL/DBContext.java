/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Models.Book;
import Models.Customer;
import Models.ListBorrow;
import java.util.ArrayList;

/**
 *
 * @author Ryuu
 */
public class DBContext {

    private ArrayList<Book> book = new ArrayList<>();
    private ArrayList<Customer> customer = new ArrayList<>();
    private ArrayList<ListBorrow> listBorrows = new ArrayList<>();
    private int countBook;
    private int countCus;

    public DBContext() {
    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public ArrayList<ListBorrow> getListBorrows() {
        return listBorrows;
    }

    public void setListBorrows(ArrayList<ListBorrow> listBorrows) {
        this.listBorrows = listBorrows;
    }

    //Get BookByID
    public Book getBookByID(int ID) {
        for (Book b : book) {
            if (b.getId() == ID) {
                return b;
            }
        }
        return null;
    }

    //Get CustomerByID
    public Customer getCustomerByID(int ID) {
        for (Customer c : customer) {
            if (c.getId() == ID) {
                return c;
            } else {
                System.out.println("| ID enter not found!!");
            }
        }
        return null;
    }

    //Get CustomerByName
    public Customer getCustomerByName(String Name) {
        for (Customer c : customer) {
            if (c.getName().equals(Name)) {
                return c;
            } else {
                System.out.println("| Name enter not found!!");
            }
        }
        return null;
    }

    //Add Book
    public boolean addBook(Book b) {
        boolean check = false;
        if (countBook == 0) {
            book.add(b);
            System.out.println("| Add Book Success!!");
            countBook++;
            return true;
        } else if (countBook >= 1) {
            for (Book bo : book) {
                if (bo.getId() == b.getId()) {
                    System.out.println("| Book already exist!!");
                    return false;
                }
            }
            book.add(b);
            System.out.println("| Add Book Success!!");
            return true;
        }
        return check;
    }

    //Add Customer
    public boolean addCustomer(Customer c) {
        boolean check = false;
        if (countCus == 0) {
            customer.add(c);
            System.out.println("| Add Customer Success!!");
            countCus++;
            return true;
        } else if (countCus >= 1) {
            for (Customer cu : customer) {
                if (cu.getId() == c.getId()) {
                    System.out.println("| Customer already exist!!");
                    return false;
                }
            }
            customer.add(c);
            System.out.println("| Add Customer Success!!");
            return true;
        }
        return check;
    }

    //Add ListBorrowBook
    public void addListBorrow(ListBorrow list) {
        listBorrows.add(list);
    }
}
