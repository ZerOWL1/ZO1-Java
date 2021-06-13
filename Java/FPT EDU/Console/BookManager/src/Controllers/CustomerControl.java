/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import DAL.DBContext;
import Models.Customer;
import Models.ListBorrow;
import java.util.Scanner;
import Validation.Validation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Ryuu
 */
public class CustomerControl {

    private DBContext db;
    Scanner sc = new Scanner(System.in);
    private Validation val = new Validation();

    public CustomerControl(DBContext db) {
        this.db = db;
    }

    public Customer addCustomer() {
        Customer c = new Customer();
        System.out.println("|__Add Customer__");
        System.out.print("| ID: ");
        String cid = sc.nextLine();
        c.setId(val.checkInputInt(cid));
        System.out.print("| Name: ");
        String cname = sc.nextLine();
        c.setName(val.checkInputString(cname));
        db.addCustomer(c);
        return c;
    }

    public void DisplayCustomer() {
        ArrayList<Customer> cus = db.getCustomer();
        System.out.println("|__List of Customer borrow Books__");
        int count = 1;
        for (Customer cu : cus) {
            double sum = 0;
            int cusID = cu.getId();
            Customer c = db.getCustomerByID(cusID);
            System.out.println("| " + cu.getName() + " were borrowed: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            for (ListBorrow listBo : c.getBorrow()) {
                System.out.println("| Book's Name" + count + ": " + listBo.getBook().getName());
                System.out.println("| Borrow Date: " + sdf.format(listBo.getDateBorrow()));
                System.out.println("| Return Date: " + listBo.getDateBack());
                System.out.println("| Price: " + listBo.getBook().getPrice());
                sum += listBo.getBook().getPrice();
            }
            System.out.println("| Total Price: " + sum * 0.3);
        }
    }
}
