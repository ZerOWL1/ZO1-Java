
import java.io.File;
import java.io.FileNotFoundException;
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

    public static void main(String[] args) throws FileNotFoundException {
        File file = checkFile("Enter file name: ");
        countCoins(new Scanner(file));
    }
    
    /** This method gonna check file if file exist or not
     * 
     * @param msg
     * @return 
     */
    public static File checkFile(String msg) {
        String name = "";
        File file;
        do {
            System.out.print(msg);
            try {
                name = SC.nextLine();
                file = new File(name);
                if (file.exists()) {
                    break;
                } else {
                    System.err.println("File " + name + " does not exist. "
                            + "Please Re-Enter");
                }
            } catch (Exception e) {
                System.err.println("Invalid File Input. Please Re-Enter");
            }
        } while (true);
        return file;
    }

    /** This method countCoins has a parameter Scanner
     * 
     * @param input 
     */
    public static void countCoins(Scanner input) {
        double totalCents = 0; //3 + 50 + 1 + 15 + 40 = 109
        double amount = 0; //1
        while (input.hasNext()) {
            //abc pennies 2 quarters 1 pennies 3 nickels 4 dimes
            //abc
            String centValue = input.next();

            try {
                //abc
                amount = Double.parseDouble(centValue);
            } catch (Exception e) {
                System.err.println("Invalid coins value!");
                return;
            }
            //3 + 0.2 + 8.5 + 15 + 40 =  66.7
            
            //pennies
            String centType = input.next();
            if (centType.equalsIgnoreCase("pennies")) {
                totalCents += amount * 1;
            } else if (centType.equalsIgnoreCase("nickels")) {
                totalCents += amount * 5;
            } else if (centType.equalsIgnoreCase("dimes")) {
                totalCents += amount * 10;
            } else if (centType.equalsIgnoreCase("quarters")) {
                totalCents += amount * 25;
            } else {
                System.out.println("Invalid Data!!");
                return;
            }
        }
        System.out.println("Total money: $" + String.format("%.2f", totalCents / 100));
    }
}
