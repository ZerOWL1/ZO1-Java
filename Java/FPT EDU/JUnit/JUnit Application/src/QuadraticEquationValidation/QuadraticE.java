/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadraticEquationValidation;

/**
 *
 * @author Ryuu
 */
public class QuadraticE {
    public String QuadraticEquation(float a, float b, float c) {
        float delta = b * b - 4 * a * c;
        if (a == 0 && b == 0 && c != 0) {
            return "PT Vo Nghiem";
        } else if (a == 0 && b == 0 && c == 0) {
            return "PT Vo So Nghiem";
        } else if (a == 0 && b != 0 && c != 0) {
            return "PT Co 1 Nghiem: " + (-c / b);
        } else if (delta < 0) {
            return "PT Vo Nghiem cause Delta";
        } else if (delta == 0) {
            float x = (-b / (2 * a));
            return "PT Co 1 Nghiem Duy Nhat: " + x;
        } else{
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            return ("PT Co 2 Nghiem Phan Biet: " + x1 + ", " + x2);
        }
    }
}
