/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CandidateValidation;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Ryuu
 */
public class CandidateValidation {

    private final Scanner sc = new Scanner(System.in);

    public int inputInteger(int min, int max, int value) {
        while (true) {
            try {
                if (value >= min && value <= max) {
                    return value;
                } else {
                    return 0;
                }
            } catch (NumberFormatException e) {
                return 0;
            }
        }
    }

    public String inputString(String result) {
        while (true) {
            if (result.isEmpty()) {
                return "You've enter nothing";
            } else {
                return result;
            }
        }
    }

    public String inputphoneNumber(String phoneNumber) {
        while (true) {
            if (phoneNumber.matches("^\\d{10,11}$")) {
                return phoneNumber;
            } else {
                return "Phone number minimum 10 numbers";
            }
        }
    }

    public String inputEmail(String email) {
        while (true) {
            if (email.matches("^[\\w]+[\\w]*@[\\w]+(\\.[\\w]+){1,3}$")) {
                return email;
            } else {
                return "Format <account name>@<domain>.";
            }
        }
    }

    public int inputYearOfExperience(int yearExperience, int birthDate) {
        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
        int age = yearCurrent - birthDate;
        while (true) {
            if (yearExperience >= 0 && yearExperience <= 100) {
                if (yearExperience > age) {
                    System.out.println("year of experience must be smaller than age");
                    return 0;
                } else {
                    return yearExperience;
                }
            }
        }
    }

    public String inputRankOfEdu(int choose) {
        boolean flag = false;
        String rank = "";
        while (!flag) {
            switch (choose) {
                case 1:
                    rank = "Excellence";
                    flag = true;
                    break;
                case 2:
                    rank = "Good";
                    flag = true;
                    break;
                case 3:
                    rank = "Fair";
                    flag = true;
                    break;
                case 4:
                    rank = "Poor";
                    flag = true;
                    break;
                default:
                    rank = "You've enter invalid number!!";
                    flag = true;
                    break;
            }
        }
        return rank;
    }

    public boolean chooseYN(String choose) {
        while (true) {
            choose = inputString(choose).toLowerCase().substring(0, 1);
            switch (choose) {
                case "y":
                    return true;
                case "n":
                    return false;
                default:
                    System.out.println("enter Y/N only!");
                    return false;
            }
        }
    }
    
}
