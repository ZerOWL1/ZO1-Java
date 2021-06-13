/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMIStatus;

/**
 *
 * @author Ryuu
 */
public class BMIStatus {

    public String BMIStatus(float bmi) {
        if (bmi < 16) {
            return "Thin Class I";
        } else if (bmi >= 16 && bmi < 17) {
            return "Thin Class II";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Thin";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Pre-Obesity";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesity Class I";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesity Class II";
        } else {
            return "Obesity Class III";
        }
    }

    public float BMICalculator(String wei, String hei) {
        if (hei.isEmpty() || wei.isEmpty()) {
            System.out.println("You've not enter something.");
            return 0;
        } else {
            float weight = Float.parseFloat(wei);
            float height = Float.parseFloat(hei);
            if (weight <= 0 || height <= 0) {
                System.out.println("Out of limit.");
                return 0;
            }
            return (100 * 100 * weight) / (height * height);
        }
    }
}
