/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMIStatus;

import org.junit.Test;
import static org.junit.Assert.*;
import BMIStatus.BMIStatus;
/**
 *
 * @author Ryuu
 */
public class BMIJUnitTest {
    BMIStatus bmi;
    public BMIJUnitTest() {
        bmi = new BMIStatus();
    }
    
    //Test49
    @Test
    public void testBMIStatus(){
        float input = 13.2f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Thin Class I";
        assertEquals(expectedResult, rs);
    }
    
    //Test50
    @Test
    public void testBMIStatus1(){
        float input = 16.6f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Thin Class II";
        assertEquals(expectedResult, rs);
    }
    
    //Test51
    @Test
    public void testBMIStatus2(){
        float input = 17.6f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Thin";
        assertEquals(expectedResult, rs);
    }
    
    //Test52
    @Test
    public void testBMIStatus3(){
        float input = 19f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Normal";
        assertEquals(expectedResult, rs);
    }
    
    //Test53
    @Test
    public void testBMIStatus4(){
        float input = 27f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Pre-Obesity";
        assertEquals(expectedResult, rs);
    }
    
    //Test54
    @Test
    public void testBMIStatus5(){
        float input = 31.5f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Obesity Class I";
        assertEquals(expectedResult, rs);
    }
    
    //Test55
    @Test
    public void testBMIStatus6(){
        float input = 37f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Obesity Class II";
        assertEquals(expectedResult, rs);
    }
    
    //Test55
    @Test
    public void testBMIStatus7(){
        float input = 45f;
        String rs = bmi.BMIStatus(input);
        String expectedResult = "Obesity Class III";
        assertEquals(expectedResult, rs);
    }
    
    //Test55
    @Test
    public void BMICalculator(){
        String weight = "-1";
        String height = "";
        float rs = bmi.BMICalculator(weight, height);
        float expectedResult = 0;
        assertEquals(expectedResult, rs, 0.00001);
    }
    
    //Test56
    @Test
    public void BMICalculator1(){
        String weight = "45";
        String height = "168";
        float rs = bmi.BMICalculator(weight, height);
        float expectedResult = 15.94f;
        assertEquals(expectedResult, rs, 0.11111111);
    }
    
    //Test57
    @Test
    public void BMICalculator2(){
        String weight = "-1";
        String height = "168";
        float rs = bmi.BMICalculator(weight, height);
        float expectedResult = 0;
        assertEquals(expectedResult, rs, 0.11111111);
    }
}
