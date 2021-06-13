/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import ChangeBaseValidation.ChangeBaseValidation;

/**
 *
 * @author Ryuu
 */
public class BaseJUnit {

    ChangeBaseValidation changeBase;

    public BaseJUnit() {
        changeBase = new ChangeBaseValidation();
    }

    //Test34
    @Test
    public void testcheckInputIntLimit() {
        int input = 10;
        int min = 15;
        int max = 60;

        String rs
                = changeBase.checkInputIntLimit(input, min, max);
        String expectedResult = "Invalid Data. Out of Range";
        assertEquals(expectedResult, rs);
    }

    //Test35
    @Test
    public void testcheckInputIntLimit2() {
        int input = 75;
        int min = 15;
        int max = 60;

        String rs
                = changeBase.checkInputIntLimit(input, min, max);
        String expectedResult = "Invalid Data. Out of Range";
        assertEquals(expectedResult, rs);
    }

    //Test36
    @Test
    public void testcheckInputIntLimit3() {
        int input = 30;
        int min = 15;
        int max = 60;

        String rs
                = changeBase.checkInputIntLimit(input, min, max);
        String expectedResult = "Valid Data";
        assertEquals(expectedResult, rs);
    }

    //Test37
    @Test
    public void testcheckInputBinary() {
        String input = "30";
        String rs
                = changeBase.checkInputBinary(input);
        String expectedResult = "Invalid Binary Number";
        assertEquals(expectedResult, rs);
    }

    //Test38
    @Test
    public void testcheckInputBinary2() {
        String input = "011001";
        String rs
                = changeBase.checkInputBinary(input);
        String expectedResult = "Valid Binary Number";
        assertEquals(expectedResult, rs);
    }

    //Test39
    @Test
    public void testcheckInputDecimal() {
        String input = "1112333123";
        String rs
                = changeBase.checkInputDecimal(input);
        String expectedResult = "Valid Decimal Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test40
    @Test
    public void testcheckInputDecimal2() {
        String input = "12A";
        String rs
                = changeBase.checkInputDecimal(input);
        String expectedResult = "Invalid Decimal Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test40
    @Test
    public void testcheckInputHexaDecimal() {
        String input = "12A";
        String rs
                = changeBase.checkInputHexaDecimal(input);
        String expectedResult = "Valid Hexadecimal Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test41
    @Test
    public void testcheckInputHexaDecimal2() {
        String input = "12111W";
        String rs
                = changeBase.checkInputHexaDecimal(input);
        String expectedResult = "Invalid Hexadecimal Number";
        assertEquals(expectedResult, rs);
    }
    
    //Test42
    @Test
    public void testconvertDecimalToHexa() {
        String input = "255";
        String rs
                = changeBase.convertDecimalToHexa(input);
        String expectedResult = "FF";
        assertEquals(expectedResult, rs);
    }
    
    //Test43
    @Test
    public void testconvertDecimalToHexa2() {
        String input = null;
        String rs
                = changeBase.convertDecimalToHexa(input);
        String expectedResult = "";
        assertEquals(expectedResult, rs);
    }
    
    //Test44
    @Test
    public void testconvertBinaryToDecimal() {
        String input = "01100111";
        String rs
                = changeBase.convertBinaryToDecimal(input);
        String expectedResult = "103";
        assertEquals(expectedResult, rs);
    }
    
    //Test45
    @Test
    public void testconvertBinaryToHexa() {
        String input = "01100111";
        String rs
                = changeBase.convertBinaryToHexa(input);
        String expectedResult = "67";
        assertEquals(expectedResult, rs);
    }
    
    //Test46
    @Test
    public void testconvertHexaToDecimal() {
        String input = "67";
        int rs
                = changeBase.convertHexaToDecimal(input);
        int expectedResult = 103;
        assertEquals(expectedResult, rs);
    }
    
    //Test47
    @Test
    public void testconvertHexaToBinary() {
        String input = "67A";
        String rs
                = changeBase.convertHexaToBinary(input);
        String expectedResult = "11001111010";
        assertEquals(expectedResult, rs);
    }
    
    //Test48
    @Test
    public void testconvertDecimalToBinary() {
        String input = "67";
        String rs
                = changeBase.convertHexaToBinary(input);
        String expectedResult = "1100111";
        assertEquals(expectedResult, rs);
    }
}
