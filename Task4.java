/*
    Task 4 (10 points)
    Write a Java program that reads a volume in gallons from the user and converts it to liters using the
    formula: liters = gallons * 3.785.
    For example:
    E.g. 1: If gallons is 1, the method returns 3.785.
    E.g. 2: If gallons is 5, the method returns 18.925.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount of gallons: ");
        double gallons = scanner.nextDouble();
        scanner.close();

        System.out.print(gallons + " gallons equals " + gallonsToLiters(gallons) + " liters");
    }

    public static double gallonsToLiters(double gallons) {
        double liters = gallons * 3.785;
        return liters;
    }
}
