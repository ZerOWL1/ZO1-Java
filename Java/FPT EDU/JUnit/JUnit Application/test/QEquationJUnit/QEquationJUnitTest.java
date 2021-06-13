/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QEquationJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import QuadraticEquationValidation.QuadraticE;
/**
 *
 * @author Ryuu
 */
public class QEquationJUnitTest {
    QuadraticE qe;
    public QEquationJUnitTest() {
        qe = new QuadraticE();
    }
    
    //Test28
    @Test
    public void testQuadraticEquation(){
        float x2 = 0;
        float x1 = 0;
        float x = 1;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Vo Nghiem";
        assertEquals(expectResult, rs);
    }
    
    //Test29
    @Test
    public void testQuadraticEquation2(){
        float x2 = 0;
        float x1 = 0;
        float x = 0;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Vo So Nghiem";
        assertEquals(expectResult, rs);
    }
    
    //Test30
    @Test
    public void testQuadraticEquation3(){
        float x2 = 0;
        float x1 = 1;
        float x = 2;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Co 1 Nghiem: -2.0";
        assertEquals(expectResult, rs);
    }
    
    //Test31
    @Test
    public void testQuadraticEquation4(){
        float x2 = 1;
        float x1 = -5;
        float x = 4;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Co 2 Nghiem Phan Biet: 4.0, 1.0";
        assertEquals(expectResult, rs);
    }
    
    //Test32
    @Test
    public void testQuadraticEquation5(){
        float x2 = 6;
        float x1 = 1;
        float x = 5;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Vo Nghiem cause Delta";
        assertEquals(expectResult, rs);
    }
    
    //Test33
    @Test
    public void testQuadraticEquation6(){
        float x2 = 16;
        float x1 = -40;
        float x = 25;
        
        String rs  = qe.QuadraticEquation(x2, x1, x);
        String expectResult = "PT Co 1 Nghiem Duy Nhat: 1.25";
        assertEquals(expectResult, rs);
    }
}
