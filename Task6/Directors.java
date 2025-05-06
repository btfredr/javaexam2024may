package Task6;
/*
• Task 6.9: Additional Field in the Directors Subclass (2 points)
    • The Directors subclass should contain an additional field that stores the name of the
    last movie directed.

    • Task 6.10: Polymorphic Print Methods in Directors (4 points)
    • Use polymorphism to create two methods in the Directors class to print information
    about the directors:
    • One method should print only the first name and last name.
    • The other method should print all available information, including the last
    movie directed.
 */
public class Directors extends CompanyEmployee {
    private String lastMovieDirected;

    public Directors(int id, String firstName, String lastName, int age, String lastMovieDirected) {
        super(id, firstName, lastName, age);
        this.lastMovieDirected = lastMovieDirected;
    }

    public void printName() {
        System.out.println("Directors information: ");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
    }

    public void printAllInfo() {
        System.out.println("Directors information: ");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Last Movie Directed: " + lastMovieDirected);
    }
}
