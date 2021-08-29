
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
    
    public static String checkInputString(String msg, String regex) {
        String input = null;
        do {
            System.out.print(msg);
            input = SC.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.err.println("Incorrect Valid Data - Enter Again");
                }
            } else {
                System.err.println("You've enter empty String - Enter Again");
            }
        } while (true);
        return input;
    }
    
    /**
     * @param input
     * @return 
     */
    public static int SecondHalfLetter(String input){
        //ABCD => abcd
        input = input.toLowerCase(); 
        
        //97
        int min = (int) input.charAt(0);
        //100
        int max = (int) input.charAt(0);
        
        for (int i = 0; i < input.length(); i++) {
            //98
            int index = (int) input.charAt(i);
            
            //98 < 97
            if(index < min){
                //set new min
                min = index;
            }else{
                //set new max
                max = index;
            }
        }
        
        //declare count int number
        int count = 0;
        //get middle
        int middle = (max + min) / 2;
        //197 / 2 = 98
        for (int i = 0; i < input.length(); i++) {
            //get count by compare with middle
            if((int)input.charAt(i) > middle){
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String input = checkInputString("Enter String You Want to Count: "
                , "[A-Za-z ]+");
        int countRS = SecondHalfLetter(input);
        System.out.println("Value count: " + countRS);
    }
    
}
