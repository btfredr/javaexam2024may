package Task6;

/*
• Task 6.5: Additional Fields in the Actors Subclass (1 point)
    • The Actors subclass should include:
    • A field that holds the main genre the actor typically performs in (e.g., drama,
    comedy).
    • A field that indicates whether the actor is currently available for new roles.

    • Task 6.6: Constructor for Actors (3 points)
    • Actors should have an additional constructor that updates the two new fields in
    addition to the constructor from the superclass.

    • Task 6.7: Methods in Actors (3 points)
    • Add methods getGenre and isAvailable that read and return the values of the fields
    genre and available, respectively. 

    • Task 6.8: Override Print Method in Actors (3 points)
    • Override the print method from the superclass to create a method in the Actors class
    that prints information from all available fields.
 */

public class Actors extends CompanyEmployee {
    private String genre;
    private boolean isAvailable;

    // Method constructor
    public Actors (int id, String firstName, String lastName, int age, String genre, boolean isAvailable) {
        super(id, firstName, lastName, age);
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    // Getters
    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Overriding print method
    @Override
    public void print() {
        System.out.println("Actor information: ");
        System.out.println("ID: " + getId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Age: " + getAge());
        System.out.println("Genre: " + getGenre());
        System.out.println("Is available: " + isAvailable());
    }
}
