/*
5. Employee Salary
• Create an Employee class with fields: name, designation, and salary.
• Assign values directly in main.
• Write a method increaseSalary() to add a given amount to salary.
• Display updated salary.
*/

class Employee{
		String name ;
		String designation;
		double salary ;
		//double increase ;
		
		void display(){
			System.out.println("Employee Name		  : "+name);
		    System.out.println("Employee Designation  : "+designation);
            System.out.println("Employee Salary 	  : "+salary);
		}
       
        void increase_salary(double amount){
			
              salary+= amount ;
            System.out.println("Updated Salary        : "+salary);
			System.out.println("---------------------------------------------------------------");
		}
		
}

class Tester5{
	public static void main(String[]args){
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.name = "Mashrafee";
		e1.designation = "Software Engineer";
		e1.salary = 47000;
		
		e2.name = "Amelia";
		e2.designation = "Manager";
		e2.salary = 29000;
		
		e3.name = "Tasfiya";
		e3.designation = "Data Analyst";
		e3.salary = 40000;
		
		System.out.println("---------------------------------------------------------------");
		e1.display();
		e1.increase_salary(7260);
		
		e2.display();
		e2.increase_salary(5260);
		
		e3.display();
		e3.increase_salary(3260);
		
	}
}
/*
E:\Code\Java\NN Mam Class>javac Tester5.java

E:\Code\Java\NN Mam Class>java Tester5
---------------------------------------------------------------
Employee Name             : Mashrafee
Employee Designation  : Software Engineer
Employee Salary           : 47000.0
Updated Salary        : 54260.0
---------------------------------------------------------------
Employee Name             : Amelia
Employee Designation  : Manager
Employee Salary           : 29000.0
Updated Salary        : 34260.0
---------------------------------------------------------------
Employee Name             : Tasfiya
Employee Designation  : Data Analyst
Employee Salary           : 40000.0
Updated Salary        : 43260.0
---------------------------------------------------------------
*/

/*
 // Base class: Vehicle
class Vehicle {
    // Instance variables
    String brand;
    String model;
    
    // Constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Vehicle constructor called");
    }
}

// Derived class: Car
class Car extends Vehicle {
    // Instance variable
    int numberOfDoors;
    
    // Constructor
    public Car(String brand, String model, int numberOfDoors) {
        // Call parent constructor using super()
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
        System.out.println("Car constructor called");
    }
    
    // Method to display all details
    public void displayDetails() {
        System.out.println("\n--- Car Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create a Car object with sample data
        Car myCar = new Car("Toyota", "Camry", 4);
        
        // Call displayDetails()
        myCar.displayDetails();
    }
}
 */