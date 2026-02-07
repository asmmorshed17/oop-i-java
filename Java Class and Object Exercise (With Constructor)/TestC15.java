/*15. Employee Attendance
• Create an Employee class with fields: name, id, daysPresent, totalWorkingDays.
• Add methods:
o markAttendance(int days) → increases daysPresent.
o attendancePercentage() → returns (daysPresent / totalWorkingDays) * 100.

• In main, create two employees, update attendance for a month, and display percentage.
 */

 class Employee{
    String name ;
    int id ;
    int daysPresent ;
    int totalWorkingDays;


    //Constructor 
    Employee(String name,int id,int totalWorkingDays){
        this.name = name ;
        this.id = id ;
        this.totalWorkingDays = totalWorkingDays ;
        this.daysPresent = 0 ; //initially 0 
    }


    //Method to mark attendence
    void markAttendance(int days){
        daysPresent += days ;

        if(daysPresent>totalWorkingDays){
            daysPresent = totalWorkingDays ;
        }
    }

    //Method to calculate attendence percentage 
    double attendancePercentage(){
        return ((double) daysPresent/totalWorkingDays)*100 ;
    }

    //Display employee details and attendence 
    void displayAttendence(){
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Days Present: "+daysPresent+ " / "+totalWorkingDays);
        System.out.println("Attendence Percentage: "+attendancePercentage()+ "%");
        System.out.println("-------------------------------------------------------------");
    }
 }
 
public class TestC15 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Morshed",101,22);

        Employee emp2 = new Employee("Sadia",107,22);

        emp1.markAttendance(20);
        emp2.markAttendance(18);
        
        System.out.println("-------------------------------------------------------------");
        emp1.displayAttendence();
        emp2.displayAttendence();

           
    }
    
}

/*
-------------------------------------------------------------
Employee Name: Morshed
Employee ID: 101
Days Present: 20 / 22
Attendence Percentage: 90.9090909090909%
-------------------------------------------------------------
Employee Name: Sadia
Employee ID: 107
Days Present: 18 / 22
Attendence Percentage: 81.81818181818183%
-------------------------------------------------------------
 */