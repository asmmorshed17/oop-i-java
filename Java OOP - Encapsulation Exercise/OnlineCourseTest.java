/*
Exercise 9: Online Course System
Create two classes:
1. Course
o Private fields: courseName, instructor, capacity.
o Provide constructor and getters.
o Add method showCourseInfo().

2. Student
o Private fields: name, email.
o Provide constructor, getters, and a method enroll(Course c) to print
enrollment details.
• In the main method, create multiple students and enroll them into a course.
 */


// Course class
class Course {

    private String courseName;
    private String instructor;
    private int capacity;

    // Constructor
    public Course(String courseName, String instructor, int capacity) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    // Show course info
    public void showCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Capacity: " + capacity);
    }
}

// Student class
class Student {

    private String name;
    private String email;

    // Constructor
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Enroll in course
    public void enroll(Course c) {
        System.out.println(name + " (" + email + ") enrolled in " + c.getCourseName());
    }
}

// Main class
public class OnlineCourseTest {
    public static void main(String[] args) {

        // Create a course
        Course course = new Course("Java Programming", "Jenny Mam", 50);
        course.showCourseInfo();

        System.out.println();

        // Create students and enroll them
        Student s1 = new Student("Sadia", "sadia@gmail.com");
        Student s2 = new Student("Samiha", "samiha@gmail.com");
        Student s3 = new Student("Morshed", "morshed@gmail.com");

        s1.enroll(course);
        s2.enroll(course);
        s3.enroll(course);
    }
}

/*
Course: Java Programming
Instructor: Jenny Mam
Capacity: 50

Sadia (sadia@gmail.com) enrolled in Java Programming
Samiha (samiha@gmail.com) enrolled in Java Programming
Morshed (morshed@gmail.com) enrolled in Java Programming

*/