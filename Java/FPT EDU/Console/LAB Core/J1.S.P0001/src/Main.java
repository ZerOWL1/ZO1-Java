
import java.util.Random;
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

    public static void main(String[] args) {
        int size = checkIntLimit("Enter size: ", 1, Integer.MAX_VALUE);
        int min = checkIntLimit("Enter min: ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        int max = checkIntLimit("Enter max: ", min, Integer.MAX_VALUE);

        int[] arr = randomArrayData(size, min, max);
        //int[] arr2 = {5, 1, 12, -5, 16};

        System.out.print("Unsorted Array: " + printArrData(arr));
        System.out.print("Sorted Array: " + printArrData(bubbleSort(arr)));
    }
    
    /** This method return user input integer from min to max
     * 
     * @param mes
     * @param min
     * @param max
     * @return 
     */
    public static int checkIntLimit(String mes, int min, int max) {
        int rs = -1;
        do {
            System.out.print(mes);
            String input = SC.nextLine();
            try {
                rs = Integer.parseInt(input);
                if (rs < min || rs > max) {
                    throw new Exception();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Please enter data in range " + min + " to " + max + "");
            }
        } while (true);
        return rs;
    }
    
    /** This method gonna random all value in an array from range min and max
     * 
     * @param size
     * @param min
     * @param max
     * @return 
     */
    public static int[] randomArrayData(int size, int min, int max) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //random.nextInt(30 + 10) - 10;
            arr[i] = r.nextInt(max - min) + min;
        }
        return arr;
    }
    
    /** This method is bubbleSort Algorithm
     * 
     * @param arr
     * @return 
     */
    public static int[] bubbleSort(int[] arr) {
        int i, j, temp = 0;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap <=> if() true
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    /** 2 4 1 4 3 2
     *  2 4 1 4 3 2 
     *  2 1 4 4 3 2
     *  2 1 4 3 4 2
     *  2 1 4 3 2 4
     * 
     *  1 2 3 2 4 4
     *  
     *  1 2 2 3 4 4
     */
    
    /** This method will print all value in array parameter input
     * 
     * @param arr
     * @return 
     */
    public static String printArrData(int[] arr) {
        String rs = "[";
        for (int i = 0; i < arr.length; i++) {
            rs += arr[i];
            if (i < arr.length - 1) {
                rs += ", ";
            }
        }
        rs += "]\n";
        return rs;
    }
}
