/*
    Task 3 . (15 points)

    Write a method that takes an integer number n as an argument. If n is positive, the program should
    use a do-while loop to write a countdown from n to n-5. If n is negative, the program should print
    the absolute value of n.
    E.g. 1: for n = 6, the program should write: 6,5,4,3,2,1
    E.g. 2: for n = -7, the program should write: 7
 */


public class Task3 {

    public void countdownOrAbsolute(int n) {

        int counter = n;
        do {
            System.out.print(n + ", ");
            counter++;
        } while (counter < n-5);

        do {
            int abs = n*n;
            System.out.print(abs);
        } while (n < 0);
    }
}
