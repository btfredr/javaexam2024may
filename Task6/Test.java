package Task6;

/*
    • Task 6.11: Test Class with Main Method (5 points)
    • Create a simple Test class with a main method, that will create instances of one
    Actor and one Director and print details from both.

    Pay attention to the use of access modifiers and the readability of the code. During the assessment
    of this task, special attention will be focused on the ability to implement fundamental principles of
    object-oriented programming: inheritance, encapsulation, and polymorphism.
 */

public class Test {
    public static void main(String[] args) {
        Actors actor = new Actors(1, "Ola", "Nordmann", 57, "Action", true);
        Directors director = new Directors(2, "Kari", "Nordmann", 34, "Børning");

        actor.print();
        director.printAllInfo();
    }
}
