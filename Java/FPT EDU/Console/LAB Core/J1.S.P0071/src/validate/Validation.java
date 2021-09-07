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
     * @param mode
     * @return
     */
    public static int checkIntLimit(String msg, int min, int max, boolean mode) {
        int rs = -1;
        do {
            try {
                System.out.print(msg);
                String input = SC.nextLine();

                if (mode == false && input.equalsIgnoreCase("nope")) {
                    break;
                }

                rs = Integer.parseInt(input);

                if (rs < min || rs > max) {
                    throw new NumberFormatException();
                }
                break;
            } catch (Exception e) {
                System.err.println("Please input data value in range "
                        + min + " to " + max);
            }
        } while (true);
        return rs;
    }

    /**
     * This method used to check inputString parse to Double then return double
     * rs
     *
     * @param MSG
     * @param min
     * @param max
     * @param mode
     * @return
     */
    public static double checkDouble(String MSG, double min, double max, boolean mode) {
        double rs = 0.0;

        do {
            System.out.print(MSG);
            String input = SC.nextLine();

            if (mode == false && input.equalsIgnoreCase("nope")) {
                break;
            }
            try {
                rs = Double.parseDouble(input);
                double check = rs % 0.5;
                if (rs >= min && rs <= max && check == 0) {
                    break;
                }
                System.err.println("Out of range, Please enter a number in range " + min + " - " + max);
            } catch (Exception e) {
                System.err.println("Incorrect input, Please enter again!");
            }
        } while (true);

        return rs;
    }

    /**
     * This method used to check inputString while user enter a string
     *
     * @param mode
     * @Check empty or check matches with Regex
     * @param msg
     * @param regex
     * @return
     */
    public static String checkInputString(String msg, String regex, boolean mode) {
        String input = null;
        do {
            System.out.print(msg);
            input = SC.nextLine().trim();

            if (!input.isEmpty()) {
                if (input.matches(regex)) {
                    if (mode == false && input.equalsIgnoreCase("nope")) {
                        break;
                    } else {
                        if (!input.equalsIgnoreCase("nope")) {
                            break;
                        }else{
                            String modeStr = mode == true ? "ADD" : "UPDATE"; 
                            System.err.println("Cant enter \"nope\" in " 
                                    + modeStr + " mode");
                        }
                    }
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
     * @param mes
     * @param mode
     * @1. Code
     * @2. Test
     * @3. Manager
     * @4. Learn
     * @return
     */
    public static String checkInputTaskTypeID(String mes, boolean mode) {
        String rs = null;
        int taskTypeID = checkIntLimit(mes, 1, 4, mode);
        switch (taskTypeID) {
            default:
                break;
            case 1:
                rs = "Code";
                break;
            case 2:
                rs = "Test";
                break;
            case 3:
                rs = "Design";
                break;
            case 4:
                rs = "Review";
                break;
        }
        return rs;
    }

    /**
     * This method used to check user input date with format:
     *
     * @param mode
     * @MMM-dd-yyyy = Aug-12-2021
     * @param msg
     * @param format
     * @return
     */
    public static Date checkInputDate(String msg, String format, boolean mode) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        do {
            System.out.print(msg);
            String input = SC.nextLine();
            try {
                if (mode == false && input.equalsIgnoreCase("nope")) {
                    break;
                }
                date = sdf.parse(input);
                break;
            } catch (ParseException e) {
                System.err.println("Date format "
                        + format + " - Please Enter Again");
            }
        } while (true);
        return date;
    }

    /**
     * This method used to return user Task Object by input TaskID
     *
     * @param taskID
     * @param listTask
     * @return
     */
    public static Task checkIDExist(int taskID, ArrayList<Task> listTask) {
        for (Task task : listTask) {
            if (task.getID() == taskID) {
                return task;
            }
        }
        return null;
    }

}
