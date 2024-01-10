package homework;

import java.util.Scanner;
import java.lang.Math;

public class RootOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int c = d.nextInt();
        double x1, x2;
        int D = b * b - 4 * a * c;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The quadratic equation has two distinct real roots: \n Root 1: " + x1 + "\n Root 2: " + x2);
        } else if (D == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("The quadratic equation has one distinct real roots: \n Root 1: " + x1);
        } else if (D < 0) {
            System.out.println("The quadratic equation has not roots");
        }
    }
}

