/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import entity.Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ryuu
 */
public class Validation {

    //Declare Scanner
    private static final Scanner SC = new Scanner(System.in);
    //private static final String TASK_PLAN_VALID = "^[0-9]{1,2}\\.5|[0-9]{1,2}\\.0$";

    /**
     * This method used to check Integer Limit while user input options
     *
     * @param msg
     * @param min
     * @param max
     * @return
     */
    public static int checkIntLimit(String msg, int min, int max) {
        int input = -1;
        do {
            try {
                System.out.print(msg);
                input = Integer.parseInt(SC.nextLine());

                if (input < min || input > max) {
                    throw new NumberFormatException();
                }

                break;
            } catch (Exception e) {
                System.err.println("Please input data in range "
                        + min + " to " + max);
            }
        } while (true);
        return input;
    }

    /**
     * This method used to check inputString while user enter a string
     *
     * @Check empty or check matches with Regex
     * @param msg
     * @param regex
     * @return
     */
    public static String checkInputString(String msg, String regex) {
        String input = null;
        do {
            System.out.print(msg);
            input = SC.nextLine().trim();
            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    break;
                } else {
                    System.err.println("Incorrect Valid Data - Enter Again");
                }
            } else {
                System.err.println("You've enter empty String - Enter Again");
            }
        } while (true);
        return input;
    }

    /**
     * This method used to check InputTaskTypeID input from 1 to 4
     *
     * @param msg
     * @1. Code
     * @2. Test
     * @3. Manager
     * @4. Learn
     * @return
     */
    public static String checkInputTaskTypeID(String msg) {
        String rs = null;
        int taskTypeID = checkIntLimit(msg, 1, 4);
        switch (taskTypeID) {
            case 1:
                rs = "Code";
                break;
            case 2:
                rs = "Test";
                break;
            case 3:
                rs = "Desgin";
                break;
            case 4:
                rs = "Review";
                break;
        }
        return rs;
    }

    /**
     * This method used to check Task Plan input from 8.0 to 17.5
     *
     * @param min
     * @param max
     * @8.0 = 8AM
     * @17.5 = 5.30PM
     * @param msg
     * @param regex
     * @return
     */
    public static double checkInputPlan(String msg, String regex, 
            double min, double max) {
        double rs = 0.0;
        do {
            String input = checkInputString(msg, regex);
            if (Double.parseDouble(input) >= 8.0
                    && Double.parseDouble(input) <= 17.5) {
                rs = Double.parseDouble(input);
                break;
            } else {
                System.err.println("Please Enter Task Plan "
                        + "From "+min+" to "+max+"");
            }
        } while (true);
        return rs;  
    }

    /**
     * This method used to check user input date with format:
     *
     * @MMM-dd-yyyy = Aug-12-2021
     * @param msg
     * @param format
     * @return
     */
    public static Date checkInputDate(String msg, String format) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        do {
            System.out.print(msg);
            String rs = SC.nextLine();
            try {
                date = sdf.parse(rs);
                break;
            } catch (ParseException e) {
                System.err.println("Date format "
                        +format+ " - Please Enter Again");
            }
        } while (true);
        return date;
    }

    public static int checkIDExist(int taskID, ArrayList<Task> listTask) {
        int rs = -1;
        for (int i = 0; i < listTask.size(); i++) {
            if (taskID == listTask.get(i).getID()) {
                rs = 1;
                break;
            }
        }
        return rs;
    }
}
