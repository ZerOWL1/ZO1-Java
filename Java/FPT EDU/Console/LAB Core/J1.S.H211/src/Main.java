
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

    private static final Scanner SC = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int[] arr = {5, 2, 2, -5, 4, 3, 2, 4, 1, 1, 1, 0, 2, 17};

        int size = checkInputInt("Enter size of array: ", 2, Integer.MAX_VALUE);
        
        int[] arr = new int[size];
        if(size % 2 != 0) {
            System.out.println("Size must be even number!");
            return;
        }
        
        /** For loop
         * @if "i" is a even number that mean it a occurrences number
         * @if "i" is a odd number that mean it a number user want occurrences
         */
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                //enter a occurrences number of a number
                arr[i] = checkInputInt("Enter the number of occurrences: ", 1, Integer.MAX_VALUE);
            } else {
                //enter a number you want occurrences
                arr[i] = checkInputInt("Enter number: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
            }
        }
        
        //print value
        ArrayIntList.fromCounts(arr);
    }
    /** This method return a Integer number user input in range min and max
     * 
     * @param mes
     * @param min
     * @param max
     * @return 
     */
    public static int checkInputInt(String mes, int min, int max) {
        int rs = 0;
        do {
            System.out.print(mes);
            try {
                rs = Integer.parseInt(SC.nextLine());
                if (rs >= min && rs <= max) {
                    break;
                }
                System.out.println("Please enter a int number in range " + min + " - " + max);
            } catch (Exception e) {
                System.err.println("Incorrect valid data, Please RE-ENTER!");
            }
        } while (true);
        return rs;
    }
}
