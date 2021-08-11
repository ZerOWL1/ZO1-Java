
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

    /**
     * @param args the command line arguments
     */
    private static Scanner SC = new Scanner(System.in);

    public static String Reverse(String input) {
        String reverse = "";
        /**
         * @'\\s+' is split blank character 1 or more times
         * @ex: luc duong  hai
         * @=> String[] words = [luc, duong, hai];
         */
        String[] words = input.split("\\s+");
        /**
         * @ex: String[] words = [luc, duong, hai];
         * @for => [hai, duong, luc]
         */
        for (int i = words.length - 1; i >= 0; i--) {
            reverse += words[i] + " ";
        }
        /**
         * To uppercase 1st character of reverse String
         *
         * @String reverse = hai duong luc 
         * @String reverse after = Hai duong luc 
         */
        reverse = reverse.substring(0, 1).toUpperCase()
                + reverse.substring(1);
        
        //return reverse word
        return reverse.trim();
    }

    public static void main(String[] args) {
        do {
            System.out.print("Enter your String: ");
            String input = SC.nextLine().trim();
            if (!input.isEmpty()) {
                String output = Reverse(input);
                System.out.println("String After Reverse: " + output);
                break;
            } else {
                //show error mess if user enter empty sring
                System.err.println("You've enter empty string - "
                        + "Please Enter Again!");
            }
        } while (true);
    }
}
