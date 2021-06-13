/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculationValidation;

import java.util.Random;

/**
 *
 * @author Ryuu
 */
public class CalculationValidate {

    public int TotalDigitNumber(String n) {
        try {
            int value = Integer.parseInt(n);
            int DEC_10 = 10;
            int total = 0;
            do {
                total = total + value % DEC_10;
                value = value / DEC_10;
            } while (value > 0);
            return total;
        } catch (NumberFormatException e) {
        }
        return 0;
    }

    public int UCLN(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("A or B enter invalid");
            return 0;
        } else {
            if (b == 0) {
                return a;
            }
            return UCLN(b, a % b);
        }
    }

    public int BCNN(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("A or B enter invalid");
            return 0;
        } else {
            return ((a * b) / UCLN(a, b));
        }
    }

    public String checkOddEvenNum(String n) {
        try {
            int value = Integer.parseInt(n);
            if (value % 2 == 0) {
                return "Even Number";
            } else {
                return "Odd Number";
            }
        } catch (NumberFormatException e) {
            return "Invalid Input";
        }
    }

    public String checkLeapYear(String input) {
        try {
            int year = Integer.parseInt(input);
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return "Leap Year";
                    } else {
                        return "Normal Year";
                    }
                } else {
                    return "Leap Year";
                }
            } else {
                return "Normal Year";
            }
        } catch (NumberFormatException e) {
            return "Invalid Input";
        }
    }

    public double calculateCompoundInterest(String b, String t, String r, String number) {
        try {
            int base = Integer.parseInt(b);
            int time = Integer.parseInt(t);
            double rate = Double.parseDouble(r);
            int n = Integer.parseInt(number);
            double amount = base * Math.pow(1 + (rate / n), n * time);
            double cinterest = amount - base;
            return cinterest;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public double calculateInterest(String b, String t, String r) {
        try {
            int base = Integer.parseInt(b);
            int time = Integer.parseInt(t);
            double rate = Double.parseDouble(r);
            double cinterest = (base * rate * time) / 100;
            return cinterest;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public String reverseWordInMyString(String str) {
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.toUpperCase();
    }

    public double AverageCal(double[] arr) {
        double average = 0;
        if (arr.length == 0) {
            return 0;
        } else {
            double total = 0;
            for (int i = 0; i < arr.length; i++) {
                total = total + arr[i];
            }
            average = total / arr.length;
        }
        return average;
    }
    
    public String ChangeArrayIntoString(char[] arr){
        String output = String.valueOf(arr);
        return output;
    }

}
