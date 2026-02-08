
/*
Exercise 12: University Management
Create three classes:
1. Professor
o Private fields: name, department.
o Provide constructors, getters, and a method showDetails().

2. Student
o Private fields: name, rollNo.
o Provide constructors, getters, and a method showDetails().

3. University
o Private fields: ArrayList<Professor> professors, ArrayList<Student> students.
o Provide methods to add professors and students.
o Add a method printAllMembers().

• In the main method, simulate a university by adding professors and students, then
display them.
 */


import java.util.ArrayList;

// Professor class
class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void showDetails() {
        System.out.println("Professor Name: " + name + ", Department: " + department);
    }
}

// Student class
class Student {
    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void showDetails() {
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }
}

// University class
class University {

    private ArrayList<Professor> professors;
    private ArrayList<Student> students;

    public University() {
        professors = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Add professor
    public void addProfessor(Professor prof) {
        professors.add(prof);
        System.out.println("Professor " + prof.getName() + " added.");
    }

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added.");
    }

    // Print all members
    public void printAllMembers() {
        System.out.println("\n--- Professors ---");
        for (Professor p : professors) {
            p.showDetails();
        }

        System.out.println("\n--- Students ---");
        for (Student s : students) {
            s.showDetails();
        }
    }
}

// Main class
public class UniversityTest {
    public static void main(String[] args) {

        University uni = new University();

        // Adding Professors
        Professor prof1 = new Professor("Dr. Maisha Akter", "Computer Science");
        Professor prof2 = new Professor("Dr. Mimma Tabassum", "Mathematics");

        uni.addProfessor(prof1);
        uni.addProfessor(prof2);

        // Adding Students
        Student s1 = new Student("A.S.M.Morshed", "CS101");
        Student s2 = new Student("Amelia Rahman", "CS102");
        Student s3 = new Student("Sajia Afreen", "MA101");

        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addStudent(s3);

        // Display all members
        uni.printAllMembers();
    }
}


/*
Professor Dr. Maisha Akter added.
Professor Dr. Mimma Tabassum added.
Student A.S.M.Morshed added.
Student Amelia Rahman added.
Student Sajia Afreen added.

--- Professors ---
Professor Name: Dr. Maisha Akter, Department: Computer Science
Professor Name: Dr. Mimma Tabassum, Department: Mathematics

--- Students ---
Student Name: A.S.M.Morshed, Roll No: CS101
Student Name: Amelia Rahman, Roll No: CS102
Student Name: Sajia Afreen, Roll No: MA101
 */