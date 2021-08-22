
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryuu
 */
public class Main {

    private static Scanner SC = new Scanner(System.in);

    public static int checkIntLimit(String msg, int min, int max) {
        int rs = -1;
        do {
            try {
                System.out.print(msg);
                String input = SC.nextLine();

                rs = Integer.parseInt(input);

                if (rs < min || rs > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Please input data value in range "
                        + min + " to " + max);
            }
        } while (true);
        return rs;
    }

    public static void main(String[] args) {
        BankingAccount ba = new BankingAccount();
        BankingAccount.Startup st = ba.new Startup(20000);
        MinMaxAccount m = new MinMaxAccount(st);

        do {
            System.out.println("\n1. Enter Credit");
            System.out.println("2. Enter Debit");
            System.out.println("3. Show Min-Max");
            System.out.println("4. Exit");
            int option = checkIntLimit("Enter your choice: ", 1, 4);
            switch (option) {
                case 1:
                    int inputCredit = checkIntLimit("Enter Credit: ", 0, Integer.MAX_VALUE);
                    m.credit(ba.new Credit(inputCredit));
                    break;
                case 2:
                    int inputDebit = checkIntLimit("Enter Debit: ", 0, Integer.MAX_VALUE);
                    m.debit(ba.new Debit(inputDebit));
                    break;
                case 3:
                    System.out.println("Balance: " + m.getBalance());
                    System.out.println("Min: " + m.getMin());
                    System.out.println("Max: " + m.getMax());
                    break;
                case 4:
                    return;
            }

        } while (true);
    }
}
