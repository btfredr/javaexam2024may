/*
    Task 1. (10 points)

    Write a method that takes a double value (input) as an argument and returns the biggest odd
    integer number smaller than the input number. For example:
    For input = 25.2, the method returns 25.
    For input = 7.0, the method returns 5.
    For input = -5.75, the method returns -7.
 */


public class Task1 {
    public int biggestOddNum(double input) {
        if (input % 2 == 0) { // Checking if number is even.
            int result = (int) input - 1;
            return result;
        } else { // If input is odd, subtract 2 from the input value
            int res = (int) input - 2;
            return res;
        }
    }
}