/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookJUnit;

import BookValidation.Validation;
import java.text.ParseException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ryuu
 */
public class BookManagerJUnitTest {

    Validation val;

    public BookManagerJUnitTest() {
        val = new Validation();
    }
    
    /* Test Double */  
    
    //Test1
    @Test
    public void testCheckInputDouble() {
        double rs = val.checkInputDouble("10");
        double expectedResult = 0;
        assertEquals(expectedResult, rs, 0.00001);
    }
    //Test2
    @Test
    public void testCheckInputDouble2() {
        String input = "10.555";
        val = new Validation();
        double rs = val.checkInputDouble(input);
        double expectedResult = 10.555;
        
        if(rs == 0){
            System.out.println("| Invalid Data");
        }
        assertEquals(expectedResult, rs, 0.00001);
    }
    //Test3
    @Test
    public void testCheckInputDouble3() {
        String input = "abc test";
        val = new Validation();
        double rs = val.checkInputDouble(input);
        double expectedResult = 0;
        
        if(rs == 0){
            System.out.println("| Invalid Data");
        }
        assertEquals(expectedResult, rs, 0.00001);
    }
    //Test4
    @Test
    public void testCheckInputDouble4() {
        //Input 7 charNumber
        String input = "1234567.123";
        val = new Validation();
        double rs = val.checkInputDouble(input);
        double expectedResult = 0;
        
        if(rs == 0){
            System.out.println("| Out Limit Data");
        }
        assertEquals(expectedResult, rs, 0.00001);
    }
    
    /* Test Int */  
    
    //Test5
    @Test 
    public void testCheckInputInt(){
        String input = "11";
        val = new Validation();
        
        int rs = val.checkInputInt(input);
        int expectedResult = 11;
        assertEquals(expectedResult, rs);
    }
    
    //Test6
    @Test 
    public void testCheckInputInt1(){
        String input = "10.5";
        val = new Validation();
        
        int rs = val.checkInputInt(input);
        int expectedResult = 0;
        
        if(rs == 0){
            System.out.println("| Invalid Data");
        }
        assertEquals(expectedResult, rs);
    }
    
    //Test7
    @Test 
    public void testCheckInputInt2(){
        String input = "abc xyz";
        val = new Validation();
        
        int rs = val.checkInputInt(input);
        int expectedResult = 0;
        
        if(rs == 0){
            System.out.println("| Invalid Data");
        }
        assertEquals(expectedResult, rs);
    }
    
    //Test8
    @Test
    public void testCheckInputInt3(){
        String input = "1234567";
        val = new Validation();
        
        int rs = val.checkInputInt(input);
        int expectedResult = 0;
        
        if(rs == 0){
            System.out.println("| Out limit Data");
        }
        assertEquals(expectedResult, rs);
    }
    
    //Test9
    @Test
    public void testCheckInputInt4(){
        String input = "10";
        val = new Validation();
        
        int rs = val.checkInputInt(input);
        int expectedResult = 10;
        assertEquals(expectedResult, rs);
    }
    
    /* Test String */
    
    //Test10
    @Test
    public void testCheckInputString(){
        String input = "";
        val = new Validation();
        
        String rs = val.checkInputString(input);
        String expectedResult = "| You've enter _blank\n";
        assertEquals(expectedResult, rs);
    }
    
    //Test11
    @Test
    public void testCheckInputString1(){
        String input = "Luc Hai";
        val = new Validation();
        
        String rs = val.checkInputString(input);
        String expectedResult = "Luc Hai";
        assertEquals(expectedResult, rs);
    }
    
    //Test12
    @Test
    public void testCheckInputString2(){
        //Input more than 50 character
        String input = "asdsdsadasdsadsasadsadassasadsasasadsadsadsadwqeweqw";
        val = new Validation();
        
        String rs = val.checkInputString(input);
        String expectedResult = null;
        assertEquals(expectedResult, rs);
    }
    
    /* Test Date Format */
    
    //Test13
    @Test
    public void testformatDate() throws ParseException{
        String dateInput = "29/12/2021";
        
        String rs = val.formatDate(dateInput);
        String expectedResult = null;
        
        assertEquals(expectedResult, rs);
    }
    
    //Test14
    @Test
    public void testformatDate2() throws ParseException{
        String dateInput = "29-12-2021";
        
        String rs = val.formatDate(dateInput);
        String expectedResult = "29-12-2021";
        
        assertEquals(expectedResult, rs);
    }
    
    /* Test Admin */
    
    //Test15
    @Test
    public void testcheckAdmin(){
        String acc = "admin";
        String pass = "123456";
        
        boolean rs = val.checkAdmin(acc, pass);
        boolean expectedResult = true;
        assertEquals(expectedResult, rs);
    }
    
    //Test16
    @Test
    public void testcheckAdmin2(){
        String acc = "Admin";
        String pass = "123456";
        
        boolean rs = val.checkAdmin(acc, pass);
        boolean expectedResult = true;
        assertEquals(expectedResult, rs);
    }
    
    //Test17
    @Test
    public void testcheckAdmin3(){
        String acc = "123";
        String pass = "abc";
        
        boolean rs = val.checkAdmin(acc, pass);
        boolean expectedResult = false;
        assertEquals(expectedResult, rs);
    }
    
    //Test18
    @Test
    public void testcheckAdmin4(){
        String acc = "";
        String pass = "abc";
        
        boolean rs = val.checkAdmin(acc, pass);
        boolean expectedResult = false;
        assertEquals(expectedResult, rs);
    }
    
    //Test19
    @Test
    public void testcheckAdmin5(){
        String acc = "abc";
        String pass = "";
        
        boolean rs = val.checkAdmin(acc, pass);
        boolean expectedResult = false;
        assertEquals(expectedResult, rs);
    }
    
    
    
    
}
