
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

    /**
     * @param args
     */
    public static void main(String[] args) {
        int min = checkIntLimit("Enter Min: ", 0, Integer.MAX_VALUE);
        int max = checkIntLimit("Enter Max: ", min, Integer.MAX_VALUE);
        printSquare(min, max);
    }

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

    public static void printSquare(int min, int max) {
        for (int i = min; i <= max; i++) { //i=6
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) { //1<5
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    /** 1 - 5
     *  12345
     *  23451
     *  34512
     *  45123
     *  51234
     */
}
