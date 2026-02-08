/*
Exercise 4: Read-Only Encapsulation
Create a class Book:
• Private fields: title, author.
• Provide a constructor to set values (no setters).
• Only provide getters.
• Add a method describe() that returns "Title by Author".
• In the main method, create multiple books and print details using the method.
 */

class Book {

    // Private fields (read-only)
    private String title;
    private String author;

    // Constructor to initialize values
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Only getters (no setters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to describe the book
    public String describe() {
        return title + " by " + author;
    }
}

// Main class
public class BookTest {
    public static void main(String[] args) {

        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        Book b3 = new Book("Head First Java", "Kathy Sierra");

        System.out.println(b1.describe());
        System.out.println(b2.describe());
        System.out.println(b3.describe());
    }
}

/* 
Output: 
Clean Code by Robert C. Martin
Effective Java by Joshua Bloch
Head First Java by Kathy Sierra
 */