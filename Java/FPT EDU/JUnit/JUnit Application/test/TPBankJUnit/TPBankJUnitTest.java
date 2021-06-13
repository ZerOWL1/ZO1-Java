/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TPBankJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import TPBank.TienPhongBank;
/**
 *
 * @author Ryuu
 */
public class TPBankJUnitTest {
    TienPhongBank tpb;
    public TPBankJUnitTest() {
        tpb = new TienPhongBank();
    }
    
    //Test58
    @Test
    public void testcheckInputInt(){
        int min = 1;
        int max = 10;
        int number = 11;
        int rs = tpb.checkInputInt(min, max, number);
        int expectedResult = 0;
        assertEquals(expectedResult, rs);
    }
    
    //Test59
    @Test
    public void testcheckInputInt1(){
        int min = 1;
        int max = 10;
        int number = 5;
        int rs = tpb.checkInputInt(min, max, number);
        int expectedResult = 5;
        assertEquals(expectedResult, rs);
    }
    
    //Test60
    @Test
    public void testcheckAccountNumber(){
        String acc = "0123456789";
        String rs = tpb.checkAccountNumber(acc);
        String expectedResult = "You've valid account....";
        assertEquals(expectedResult, rs);
    }
    
    //Test61
    @Test
    public void testcheckAccountNumber1(){
        String acc = "0123";
        String rs = tpb.checkAccountNumber(acc);
        String expectedResult = "Error Input Account....";
        assertEquals(expectedResult, rs);
    }
    
    //Test62
    @Test
    public void testcheckPassword(){
        String pass = "LUCHAIUTA95";
        boolean rs = tpb.checkPassword(pass);
        boolean expectedResult = true;
        assertEquals(expectedResult, rs);
    }
    
    //Test63
    @Test
    public void testcheckPassword2(){
        String pass = "LUC95";
        boolean rs = tpb.checkPassword(pass);
        boolean expectedResult = false;
        assertEquals(expectedResult, rs);
    }
    
    
}
