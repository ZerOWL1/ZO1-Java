/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAL.DBContext;
import Models.Book;
import Models.Customer;
import Models.ListBorrow;
import java.util.ArrayList;
import java.util.Scanner;
import Validation.Validation;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ryuu
 */
public class BorrowBookControl {

    private DBContext db;
    private Scanner sc = new Scanner(System.in);
    private Validation val = new Validation();

    public BorrowBookControl(DBContext db) {
        this.db = db;
    }

    public void ShowInfor() {
        ArrayList<Book> book = db.getBook();
        ArrayList<Customer> cus = db.getCustomer();
        System.out.println("| List of Customer: ");
        for (Customer c : cus) {
            System.out.println("| ID: " + c.getId() + "    |" + "Name: " + c.getName());
        }
        System.out.println("| List of Books: ");
        for (Book b : book) {
            System.out.println("| ID: " + b.getId() + "    |" + "Name: " + b.getName());
        }
    }

    public ListBorrow addListBorrow() throws ParseException {
        ArrayList<Book> book = db.getBook();
        ArrayList<Customer> cus = db.getCustomer();
        System.out.println("|__List of Customer__");
        for (Customer c : cus) {
            System.out.println("| ID: " + c.getId()
                    + "\t" + "Name: " + c.getName());
        }
        System.out.println("|__List of Books__");
        for (Book b : book) {
            System.out.println("| ID: " + b.getId()
                    + "\t" + "Name: " + b.getName());
        }
        System.out.println("| Borrow Book Date: ");
        System.out.print("| CustomerID: ");
        String cid = sc.nextLine();
        Customer c = db.getCustomerByID(val.checkInputInt(cid));
        System.out.print("| BookID: ");
        String bid = sc.nextLine();
        Book b = db.getBookByID(val.checkInputInt(bid));

        //Get Current
        Date currentDate = Calendar.getInstance().getTime();
        System.out.print("| Return Date: ");
        String backDate = sc.nextLine();

        ListBorrow list = new ListBorrow(b, c, currentDate, val.formatDate(backDate));
        db.addListBorrow(list);
        c.getBorrow().add(list);
        b.getBorrow().add(list);
        return list;
    }
}
