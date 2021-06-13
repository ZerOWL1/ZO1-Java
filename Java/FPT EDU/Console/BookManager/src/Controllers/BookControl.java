/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAL.DBContext;
import Models.Book;
import java.util.Scanner;
import Validation.Validation;

/**
 *
 * @author Ryuu
 */
public class BookControl {

    private Scanner sc = new Scanner(System.in);
    private DBContext db;
    private Validation val = new Validation();
    public BookControl(DBContext db) {
        this.db = db;
    }

    public Book addBook() {
        Book b = new Book();
        System.out.println("|____Add a Book____");
        //Enter ID
        System.out.print("|__ID: ");
        String id = sc.nextLine();
        b.setId(val.checkInputInt(id));
        
        //Enter Name
        System.out.print("|__Name: ");
        String name = sc.nextLine();
        b.setName(val.checkInputString(name));

        //Enter Price
        System.out.print("|__Price: ");
        String price = sc.nextLine();
        b.setPrice(val.checkInputDouble(price));
        db.addBook(b);
        return b;
    }
}
