/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculationJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import CalculationValidation.CalculationValidate;
/**
 *
 * @author Ryuu
 */
public class CalculationJUnitTest {
    CalculationValidate cal;
    public CalculationJUnitTest() {
        cal = new CalculationValidate();
    }
    
    //Test82
    @Test
    public void testTotalDigitNumber(){
        String input = "";
        int rs = cal.TotalDigitNumber(input);
        int expectedResult = 0;
        assertEquals(expectedResult, rs);
    }
    
    //Test83
    @Test
    public void testTotalDigitNumber1(){
        String input = "123456";
        int rs = cal.TotalDigitNumber(input);
        int expectedResult = 21;
        assertEquals(expectedResult, rs);
    }
    
    //Test84
    @Test
    public void testUCLN(){
        int a = 1;
        int b = 10;
        int rs = cal.UCLN(a, b);
        int expectedResult = 1;
        assertEquals(expectedResult, rs);
    }
    
    //Test85
    @Test
    public void testUCLN1(){
        int a = 0;
        int b = 0;
        int rs = cal.UCLN(a, b);
        int expectedResult = 0;
        assertEquals(expectedResult, rs);
    }
    
    //Test86
    @Test
    public void testBCLN(){
        int a = 0;
        int b = 0;
        int rs = cal.BCNN(a, b);
        int expectedResult = 0;
        assertEquals(expectedResult, rs);
    }
    
    //Test87
    @Test
    public void testBCLN1(){
        int a = 10;
        int b = 20;
        int rs = cal.BCNN(a, b);
        int expectedResult = 20;
        assertEquals(expectedResult, rs);
    }
    
    //Test88
    @Test
    public void testCheckOddEvenNum(){
        String input = "abc";
        String rs = cal.checkOddEvenNum(input);
        String expectedResult = "Invalid Input";
        assertEquals(expectedResult, rs);
    }
    
    //Test89
    @Test
    public void testCheckOddEvenNum1(){
        String input = "10";
        String rs = cal.checkOddEvenNum(input);
        String expectedResult = "Even Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test90
    @Test
    public void testCheckOddEvenNum2(){
        String input = "11";
        String rs = cal.checkOddEvenNum(input);
        String expectedResult = "Odd Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test91
    @Test
    public void testcheckLeapYear(){
        String input = "demo";
        String rs = cal.checkLeapYear(input);
        String expectedResult = "Invalid Input";
        assertEquals(expectedResult, rs);
    }
    
    //Test92
    @Test
    public void testcheckLeapYear1(){
        String input = "2021";
        String rs = cal.checkLeapYear(input);
        String expectedResult = "Normal Year";
        assertEquals(expectedResult, rs);
    }
    
    //Test93
    @Test
    public void testcheckLeapYear2(){
        String input = "2004";
        String rs = cal.checkLeapYear(input);
        String expectedResult = "Leap Year";
        assertEquals(expectedResult, rs);
    }
    
    //Test93
    @Test
    public void testCalculateCompoundInterest(){
        String base = "2000";
        String time = "5";
        String rate = "0.08";
        String n = "12";
        
        double rs = cal.calculateCompoundInterest(base, time, rate, n);
        double expectedResult = 979.69;
        assertEquals(expectedResult, rs, 0.11111111);
    }
    
    //Test94
    @Test
    public void testCalculateCompoundInterest1(){
        String base = "abc";
        String time = "5";
        String rate = "0.08";
        String n = "hello";
        
        double rs = cal.calculateCompoundInterest(base, time, rate, n);
        double expectedResult = 0;
        assertEquals(expectedResult, rs, 0.11111111);
    }
    
    //Test95
    @Test
    public void testcalculateInterest(){
        String base = "abc";
        String time = "5";
        String rate = "0.08";
        String n = "hello";
        
        double rs = cal.calculateCompoundInterest(base, time, rate, n);
        double expectedResult = 0;
        assertEquals(expectedResult, rs, 0.11111111);
    }
    
    //Test96
    @Test
    public void testcalculateInterest1(){
        String base = "2000";
        String time = "6";
        String rate = "3";
        
        double rs = cal.calculateInterest(base, time, rate);
        double expectedResult = 360;
        assertEquals(expectedResult, rs, 0.11111111);
    }
    
    //Test97
    @Test
    public void testReverseWordInMyString(){
        String input = "Luc Hai";
        String rs = cal.reverseWordInMyString(input);
        String expectedResult = "CUL IAH ";
        assertEquals(expectedResult, rs);
    }
    
    //Test98
    @Test
    public void testAverageCal(){
        double[] arr = {0};
        double rs = cal.AverageCal(arr);
        double expectedResult = 0;
        assertEquals(expectedResult, rs, 0.11111);
    }
    
    //Test99
    @Test
    public void testAverageCal1(){
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double rs = cal.AverageCal(arr);
        double expectedResult = 52.4;
        assertEquals(expectedResult, rs, 0.11111);
    }
    
    //Test100
    @Test
    public void testChangeArrayIntoString(){
        char[] ch = {'G', 'o', 'o', 'd', ' ', 'M', 'o', 'r', 'n', 'i', 'n', 'g'};
        String rs = cal.ChangeArrayIntoString(ch);
        String expectedResult = "Good Morning";
        assertEquals(expectedResult, rs);
    }
}
