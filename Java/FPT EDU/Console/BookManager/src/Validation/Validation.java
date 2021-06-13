/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validation;

import Models.Admin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Ryuu
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public double checkInputDouble(String input) {
        while (true) {
            try {
                Pattern pt = Pattern.compile("^\\d{1,6}.\\d+$");
                Matcher mt = pt.matcher(input);
                boolean check = mt.matches();
                if (input == null) {
                    return 0;
                } else if (check) {
                    double price = Double.parseDouble(input);
                    return price;
                }else if(!check){
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("| You not enter Double Type data!! RE-ENTER!!\n");
                break;
            }
        }
        return 0;
    }

    public int checkInputInt(String input) {
        while (true) {
            try {
                Pattern pt = Pattern.compile("^\\d{1,6}$");
                Matcher mt = pt.matcher(input);
                boolean check = mt.matches();
                if (input == null) {
                    return 0;
                } else if (check) {
                    int id = Integer.parseInt(input);
                    return id;
                }else if(!check){
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("| You not enter Int Type data!! RE-ENTER!!\n");
                break;
            }
        }
        return 0;
    }

    public String checkInputString(String input) {
        while (true) {
            try {
                Pattern pt = Pattern.compile("^(\\w||\\s){1,50}$");
                Matcher mt = pt.matcher(input);
                boolean check = mt.matches();
                if (input.isEmpty()) {
                    return "| You've enter _blank\n";
                } else if (check) {
                    String name = input;
                    return name;
                } else if(!check){
                    return null;
                }
            } catch (NumberFormatException e) {
                System.err.println("| You not enter String Type data!! RE-ENTER!!\n");
                break;
            }
        }
        return null;
    }

    public String formatDate(String input) throws ParseException {
        while (true) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                if (input.isEmpty()) {
                    System.out.println("| You've enter Empty Date..");
                } else {
                    String dateBack = sdf.format(sdf.parse(input));
                    return dateBack;
                }
            } catch (Exception e) {
                System.err.println("| You not enter true Date data (dd-MM-yyyy)!! RE-ENTER!!\n");
                return null;
            }
        }
    }

    public boolean checkAdmin(String tk, String mk) {
        while (true) {
            try {
                String name = tk;
                int pass = Integer.parseInt(mk);
                if ((name.equals("Admin") || name.equals("admin")) && pass == 123456) {
                    System.out.println("| Login Success......\n");
                    return true;
                } else if (pass <= 0 || name.isEmpty() || pass != 123456
                        || !(name.equals("Admin") || name.equals("admin"))) {
                    System.err.println("| Error Data Input......\n");
                    return false;
                }
            } catch (NumberFormatException e) {
                System.err.println("| Data not found!! RE-ENTER!!\n");
                return false;
            }
        }
    }
}
