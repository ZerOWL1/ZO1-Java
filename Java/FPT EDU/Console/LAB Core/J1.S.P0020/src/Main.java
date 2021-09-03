
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
//Selection Sort
public class Main {

    /**
     * @param args the command line arguments
     */
    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        //get array size
        int size = checkIntLimit("Enter number of array: ", 1, Integer.MAX_VALUE);

        //declare an array
        int[] arr = new int[size];

        //add value to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkIntLimit("Enter element " + i + ": "
                    , Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        //int[] arr2 = {-1, -5, 10, 3, 5};
        System.out.print("Unsorted Array: " + printArrData(arr));

        System.out.print("Sorted Array: " + printArrData(selectionSort(arr)));
    }
    
    /**
     * This method used to let's user enter date value using Scanner
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

    /**
     * This method used to sort value in an Array using selectionSort algorithm
     *
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {
        int i, j, minValue, minIndex, temp = 0;
        //outer for loop
        for (i = 0; i < arr.length; i++) {
            minValue = arr[i]; //3
            minIndex = i; //3

            //inter for loop
            for (j = i; j < arr.length; j++) {
                if (arr[j] < minValue) { //5 < 3
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            //temp = -1
            //
            //check minValue is first value or not?
            if (minValue < arr[i]) { //-5<-1
                temp = arr[i]; //temp = -1
                arr[i] = arr[minIndex]; //-1 = -5
                arr[minIndex] = temp; //minIndex = -1
            }
        }
        return arr;
    }
    /** -1 -5 10 3 5
     * -5 -1 10 3 5
     * -5 -1 3 10 5
     * -5 -1 3 5 10
     */
    
    /**
     * This method used to print data in an array user input
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
