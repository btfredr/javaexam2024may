/*
    Task 5. (15 points)

    Write a Java program that analyzes the input string using the method:

    public void analyzeString(String input){}
    The analysis should include: the number of uppercase letters, the number of lowercase letters, the
    string length, and the number of spaces.

    E.g.: if the input string is: “Madam, I’m Adam”, the method should print:
    • The string contains 2 uppercase letters!
    • The string contains 7 lowercase letters!
    • The string is 16 characters long!
    • The string contains 2 spaces!
 */

public class Task5 {
    public static void main(String[] args) {

    }

    public void analyzeString(String input) {
        
        int uppercase = 0;
        int lowercase = 0;
        int space = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (Character.isUpperCase(c)) {
                uppercase++;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLowerCase(c)) {
                lowercase++;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isSpaceChar(c)) {
                space++;
            }
        }

        
        System.out.println("String information: ");
        System.out.println("The string contains " + uppercase + " uppercase letters!");
        System.out.println("The string contains " + lowercase + " lowercase letters!");
        System.out.println("The string is " + input.length() + " characters long!");
        System.out.println("The string contains " + space + " spaces!");
    }
}
