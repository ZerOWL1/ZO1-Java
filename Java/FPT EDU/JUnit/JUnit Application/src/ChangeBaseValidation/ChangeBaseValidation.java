/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChangeBaseValidation;

/**
 *
 * @author Ryuu
 */
public class ChangeBaseValidation {

    private static final String BINARY_VALID = "[0-1]*";
    private static final String DECIMAL_VALID = "[0-9]*";
    private static final String HEXADECIMAL_VALID = "[0-9A-F]*";
    public static final char CHAR_55 = 55;
    public static final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public String checkInputIntLimit(int input, int min, int max) {
        while (true) {
            try {
                if (input < min || input > max) {
                    return "Invalid Data. Out of Range";
                } else {
                    return "Valid Data";
                }
            } catch (NumberFormatException e) {
            }
        }
    }

    public String checkInputBinary(String input) {
        while (true) {
            if (input.matches(BINARY_VALID)) {
                return "Valid Binary Number";
            } else {
                return "Invalid Binary Number";
            }
        }
    }

    public String checkInputDecimal(String input) {
        while (true) {
            if (input.matches(DECIMAL_VALID)) {
                return "Valid Decimal Number";
            } else {
                return "Invalid Decimal Number";
            }
        }
    }

    public String checkInputHexaDecimal(String input) {
        while (true) {
            if (input.matches(HEXADECIMAL_VALID)) {
                return "Valid Hexadecimal Number";
            } else {
                return "Invalid Hexadecimal Number";
            }
        }
    }

    //convert from decimal to hexadecimal
    public String convertDecimalToHexa(String decimal) {
        String hexa = "";
        if (decimal == null) {
            return hexa;
        } else {
            int deci = Integer.parseInt(decimal);
            while (deci != 0) {
                hexa = hexDigits[deci % 16] + hexa;
                deci /= 16;
            }
        }
        return hexa;
    }

    //convert from binary to decimal
    public String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    //convert from binary to hexadecimal
    public String convertBinaryToHexa(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        String hexa = convertDecimalToHexa(decimal);
        return hexa;
    }

    //convert from hexa to decimal
    public int convertHexaToDecimal(String hexadecimal) {
        int decimal = Integer.parseInt(hexadecimal, 16);
        return decimal;
    }

    //convert from hexadecimal to binary
    public String convertHexaToBinary(String hexadecimal) {
        String binary = Integer.toBinaryString(convertHexaToDecimal(hexadecimal));
        return binary;
    }

    //convert from decimal to binary
    public String convertDecimalToBinary(String decimal) {
        String binary = Integer.toBinaryString(Integer.parseInt(decimal));
        return binary;
    }

}
