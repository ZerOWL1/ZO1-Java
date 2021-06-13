
import Controllers.BookControl;
import Controllers.BorrowBookControl;
import Controllers.CustomerControl;
import DAL.DBContext;
import Models.Admin;
import java.util.Scanner;
import Validation.Validation;
import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DBContext db = new DBContext();
        Validation val = new Validation();
        
        CustomerControl cc = new CustomerControl(db);
        BorrowBookControl bbc = new BorrowBookControl(db);
        BookControl bc = new BookControl(db);
        Admin ad = new Admin();
        System.out.println("|______Signin______");
        System.out.print("| Name: ");
        String name = sc.nextLine();
        System.out.print("| Passwords: ");
        String pass = sc.nextLine();
        boolean checkAdmin = val.checkAdmin(name, pass);
        if (checkAdmin) {
            while (true) {
                System.out.println("|________ Simple Book Management ________");
                System.out.println("| 1. Add a Book.");
                System.out.println("| 2. Add a Customer.");
                System.out.println("| 3. Borrow book.");
                System.out.println("| 4. Display customer borrow book.");
                System.out.println("| 5. All Information.");
                System.out.println("| 6. Exit.");
                System.out.print("| Enter your choices (1-6): ");
                String options = sc.nextLine();
                switch (options) {
                    default: {
                        System.out.println("| You've not enter true number!");
                        break;
                    }
                    case "1": {
                        bc.addBook();
                        System.out.println("\n");
                        break;
                    }
                    case "2": {
                        cc.addCustomer();
                        System.out.println("\n");
                        break;
                    }
                    case "3": {
                        bbc.addListBorrow();
                        System.out.println("\n");
                        break;
                    }
                    case "4": {
                        cc.DisplayCustomer();
                        System.out.println("\n");
                        break;
                    }
                    case "5": {
                        bbc.ShowInfor();
                        System.out.println("\n");
                        break;
                    }
                    case "6": {
                        System.out.println("| You've Choose Exit. ");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
