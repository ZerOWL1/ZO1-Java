/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandidateJUnit;

import org.junit.Test;
import static org.junit.Assert.*;
import CandidateValidation.CandidateValidation;

/**
 *
 * @author Ryuu
 */
public class CandidateJUnitTest {

    CandidateValidation candi;

    public CandidateJUnitTest() {
        candi = new CandidateValidation();
    }

    //Test64
    @Test
    public void testInputInteger() {
        int min = 1;
        int max = 10;
        int value = 11;
        int rs = candi.inputInteger(min, max, value);
        int expectResult = 0;
        assertEquals(expectResult, rs);
    }

    //Test65
    @Test
    public void testInputInteger1() {
        int min = 1;
        int max = 10;
        int value = 5;
        int rs = candi.inputInteger(min, max, value);
        int expectResult = 5;
        assertEquals(expectResult, rs);
    }

    //Test66
    @Test
    public void testInputString() {
        String input = "";
        String rs = candi.inputString(input);
        String expectResult = "You've enter nothing";
        assertEquals(expectResult, rs);
    }

    //Test67
    @Test
    public void testInputString1() {
        String input = "Demo";
        String rs = candi.inputString(input);
        String expectResult = "Demo";
        assertEquals(expectResult, rs);
    }

    //Test68
    @Test
    public void inputphoneNumber() {
        String input = "01234567891";
        String rs = candi.inputphoneNumber(input);
        String expectResult = "01234567891";
        assertEquals(expectResult, rs);
    }

    //Test69
    @Test
    public void inputphoneNumber1() {
        String input = "012345678910";
        String rs = candi.inputphoneNumber(input);
        String expectResult = "Phone number minimum 10 numbers";
        assertEquals(expectResult, rs);
    }

    //Test70
    @Test
    public void testinputEmail() {
        String input = "haildhe141223@fpt.edu.vn";
        String rs = candi.inputEmail(input);
        String expectResult = "haildhe141223@fpt.edu.vn";
        assertEquals(expectResult, rs);
    }

    //Test71
    @Test
    public void testinputEmail1() {
        String input = "haild.works@gmail.com";
        String rs = candi.inputEmail(input);
        String expectResult = "Format <account name>@<domain>.";
        assertEquals(expectResult, rs);
    }

    //Test72
    @Test
    public void testinputYearOfExperience() {
        int yearExperience = 22;
        int birthDate = 2000;
        int rs = candi.inputYearOfExperience(yearExperience, birthDate);
        int expectResult = 0;
        assertEquals(expectResult, rs);
    }

    //Test73
    @Test
    public void testinputYearOfExperience1() {
        int yearExperience = 4;
        int birthDate = 2000;
        int rs = candi.inputYearOfExperience(yearExperience, birthDate);
        int expectResult = 4;
        assertEquals(expectResult, rs);
    }

    //Test74
    @Test
    public void testinputRankOfEdu() {
        int choose = 1;
        String rs = candi.inputRankOfEdu(choose);
        String expectResult = "Excellence";
        assertEquals(expectResult, rs);
    }

    //Test75
    @Test
    public void testinputRankOfEdu1() {
        int choose = 2;
        String rs = candi.inputRankOfEdu(choose);
        String expectResult = "Good";
        assertEquals(expectResult, rs);
    }

    //Test76
    @Test
    public void testinputRankOfEdu2() {
        int choose = 3;
        String rs = candi.inputRankOfEdu(choose);
        String expectResult = "Fair";
        assertEquals(expectResult, rs);
    }

    //Test77
    @Test
    public void testinputRankOfEdu3() {
        int choose = 4;
        String rs = candi.inputRankOfEdu(choose);
        String expectResult = "Poor";
        assertEquals(expectResult, rs);
    }

    //Test78
    @Test
    public void testinputRankOfEdu4() {
        int choose = 10;
        String rs = candi.inputRankOfEdu(choose);
        String expectResult = "You've enter invalid number!!";
        assertEquals(expectResult, rs);
    }
    
    //Test79
    @Test
    public void testchooseYN() {
        String input = "y";
        boolean rs = candi.chooseYN(input);
        boolean expectResult = true;
        assertEquals(expectResult, rs);
    }
    
    //Test80
    @Test
    public void testchooseYN1() {
        String input = "n";
        boolean rs = candi.chooseYN(input);
        boolean expectResult = false;
        assertEquals(expectResult, rs);
    }
    
    //Test81
    @Test
    public void testchooseYN2() {
        String input = "abc";
        boolean rs = candi.chooseYN(input);
        boolean expectResult = false;
        assertEquals(expectResult, rs);
    }
}
