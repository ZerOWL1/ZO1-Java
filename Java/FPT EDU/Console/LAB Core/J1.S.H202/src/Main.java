
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

    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    private static Scanner SC = new Scanner(System.in);

    public static String printReverse(String input) {
        String reverseWord = "";
        /**
         * Check input empty or not if input string have value data
         */
        for (int i = (input.length() - 1); i >= 0; i--) {
            //reverseWord String + input character at index(i)
            reverseWord += input.charAt(i);
        }
        //return the reverse word
        return reverseWord;
    }

    public static void main(String[] args) {
        System.out.print("Enter Your String: ");
        String input = SC.nextLine().trim();
        //check empty
        if (!input.isEmpty()) {
            String output = printReverse(input);
            System.out.println("String After Reverse: " + output);
        }
    }

}
