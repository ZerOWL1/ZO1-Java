/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import AgeValidation.AgeValidation;
/**
 *
 * @author Ryuu
 */
public class AgeJUnitTest {
    AgeValidation age;
    public AgeJUnitTest() {
        age = new AgeValidation();
    }
    
    //Test20
    @Test
    public void testAge(){
        String rs = age.Age(5);
        String expectedResult = "Chilren";
        assertEquals(expectedResult, rs);
    }
    
    //Test21
    @Test
    public void testAge2(){
        String rs = age.Age(10);
        String expectedResult = "Primary School Student";
        assertEquals(expectedResult, rs);
    }
    
    //Test22
    @Test
    public void testAge3(){
        String rs = age.Age(14);
        String expectedResult = "2nd School Student";
        assertEquals(expectedResult, rs);
    }
    
    //Test23
    @Test
    public void testAge4(){
        String rs = age.Age(18);
        String expectedResult = "3rd School Student";
        assertEquals(expectedResult, rs);
    }
    
    //Test24
    @Test
    public void testAge5(){
        String rs = age.Age(20);
        String expectedResult = "University Student";
        assertEquals(expectedResult, rs);
    }
    
    //Test25
    @Test
    public void testAge6(){
        String rs = age.Age(27);
        String expectedResult = "Young Adult";
        assertEquals(expectedResult, rs);
    }
    
    //Test26
    @Test
    public void testAge7(){
        String rs = age.Age(45);
        String expectedResult = "Middle Age";
        assertEquals(expectedResult, rs);
    }
    
    //Test27
    @Test
    public void testAge8(){
        String rs = age.Age(100);
        String expectedResult = "Old Age";
        assertEquals(expectedResult, rs);
    }
    
    //Test28
    @Test
    public void testAge9(){
        String rs = age.Age(400);
        String expectedResult = "Invalid Data";
        assertEquals(expectedResult, rs);
    }
    
}
