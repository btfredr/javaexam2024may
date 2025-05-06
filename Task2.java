/*
    Task 2. (15 points)

    Write a Java program that uses two for loops to print out a pyramid of numbers. The pyramid
    should have a number of rows equal to the height specified by the user. Each row should display
    incrementing numbers starting from 1. For example, if the user specifies a height of 4, the pyramid
    printed should look like this:
    1
    1 2
    1 2 3
    1 2 3 4
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int height = scanner.nextInt();

        scanner.close();

        for(int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }
    }
}
