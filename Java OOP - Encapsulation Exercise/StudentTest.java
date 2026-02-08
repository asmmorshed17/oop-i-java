/*
Exercise 1: Basic Encapsulation (with Constructor & Method)
Create a class Student with the following:
• Private fields: name (String), age (int).
• Public getters and setters for both fields.
• Add a constructor to initialize name and age.
• Add a method displayInfo() to print student details.
• In the main method, create objects of Student using both constructor and setters,
then print the details using the method.
 */


// Student class
class Student {
    // Private data members
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class StudentTest {
    public static void main(String[] args) {

        // Object created using constructor
        Student s1 = new Student("Rahim", 20);
        s1.displayInfo();

        System.out.println();

        // Object created using setters
        Student s2 = new Student("Temp", 0);
        s2.setName("Karim");
        s2.setAge(22);
        s2.displayInfo();
    }
}

/*
Name: Rahim
Age: 20

Name: Karim
Age: 22
 */