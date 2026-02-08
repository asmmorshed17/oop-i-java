/*
Exercise 3: Encapsulation in Real-life Example
Create a class Employee:
• Private fields: name, salary.
• Provide a constructor to initialize fields (enforce salary > 10000).
• Add a method giveRaise(double amount) that increases salary only if amount > 0.
• Add a method showDetails() to print employee info.
• In the main method, test with valid and invalid salary and raise values
 */

class Employee {

    // Private data members
    private String name;
    private double salary;

    // Constructor with validation
    public Employee(String name, double salary) {
        this.name = name;

        if (salary > 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! Salary must be greater than 10000.");
            this.salary = 10000;
        }
    }

    // Method to increase salary
    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary increased by: " + amount);
        } else {
            System.out.println("Invalid raise amount!");
        }
    }

    // Method to show employee details
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class EmployeeTest {
    public static void main(String[] args) {

        // Valid salary
        Employee emp1 = new Employee("Morshed", 20000);
        emp1.showDetails();
        emp1.giveRaise(5000);
        emp1.showDetails();

        System.out.println();

        // Invalid salary and raise
        Employee emp2 = new Employee("Amelia", 8000); // invalid salary
        emp2.showDetails();
        emp2.giveRaise(-3000); // invalid raise
        emp2.showDetails();
    }
}


/*
Employee Name: Morshed
Salary: 20000.0
Salary increased by: 5000.0
Employee Name: Morshed
Salary: 25000.0

Invalid salary! Salary must be greater than 10000.
Employee Name: Amelia
Salary: 10000.0
Invalid raise amount!
Employee Name: Amelia
Salary: 10000.0
 */