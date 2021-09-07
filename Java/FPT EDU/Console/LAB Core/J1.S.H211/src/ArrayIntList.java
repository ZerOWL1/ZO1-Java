/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuu
 */
public class ArrayIntList {
    /** This method displays a String result
     * 
     * @param arr 
     */
     public static void fromCounts(int[] arr) {
         /** i += 2. That meant "i" gonna be a odd number. 
          * @Then i = even number gonna be occurrences number of ODD NUMBER
          * 
          */
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 1; j <= arr[i]; j++) {
                System.out.print(arr[i + 1] + " ");
            }
        }
        
        /** 5, 2, 2, -5, 4, 3
         *  i[0, 2, 4] = i[5, 2, 4]
         *  1 <= 5
         *  sout: 2 2 2 2 2
         *  1 <= 2
         *  sout: -5 -5
         *  1 <= 4
         *  sout: 3 3 3 3
         *  sout: 2 2 2 2 2 -5 -5 3 3 3 3
         */
    }
}
