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
		
		Employee(String Name,String Designation,double Salary){
			name = Name ;
			designation = Designation ;
			salary = Salary ;
		}
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

class TesterC5{
	public static void main(String[]args){
		Employee e1 = new Employee("Mashrafee","Software Engineer",47000);
		Employee e2 = new Employee("Amelia","Manager",29000);
		Employee e3 = new Employee("Tasfiya","Data Analyst",40000);
		
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

E:\Code\Java\NN Mam Class>javac TesterC5.java

E:\Code\Java\NN Mam Class>java TesterC5
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