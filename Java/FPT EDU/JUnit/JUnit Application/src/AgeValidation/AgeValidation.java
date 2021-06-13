/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgeValidation;

/**
 *
 * @author Ryuu
 */
public class AgeValidation {
    
    public String Age(int age){
        if((age >= 1) && (age < 6)){
            return "Chilren";
        }else if((age >= 6) && (age < 12)){
            return "Primary School Student";
        } else if((age >= 12) && (age < 16)){
            return "2nd School Student";
        }else if((age >= 16) && (age < 19)){
            return "3rd School Student";
        }else if((age >= 19) && (age < 26)){
            return "University Student";
        }else if((age >= 26 ) && (age < 41)){
            return "Young Adult";
        }else if((age >= 41) && (age < 66)){
            return "Middle Age";
        }else if((age >= 66) && (age < 301)){
            return "Old Age";
        }else{
            return "Invalid Data";
        }
    }

}
