
/*11. Grade Management System
• Create a Student class with fields: name, rollNumber, and an array marks[] for 5 subjects.

• Add methods:
o calculateAverage() → returns average marks.
o calculateGrade() → returns grade (A/B/C/D/F) based on average.
• In main, assign marks directly and display name, roll number, average, and grade. */


class Student{
    String name;
    int roolNumber;
    int [] marks = new int [5] ; //array for 5 subjects 

    //Method to calculate Average: 
    double calculateAverage(){
        int sum = 0 ;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        return (double) sum/marks.length ;
    }

    //Method to calculate grade 
    char calculateGrade(){
        double avg = calculateAverage() ;
        if(avg>=80) return 'A';
        else if(avg>=70) return 'B';
        else if(avg>=60) return 'C' ;
        else if(avg>=50) return 'D';
        else return 'F' ;
    }

    //Method to display student details
    void displayDetails(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+roolNumber);
        System.out.print("Marks: ");

        for(int m:marks){
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " +calculateAverage());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------------------------------------------");

    }
}

public class Tester11{
    public static void main(String[] args) {
        
        Student s1 = new Student ();
        s1.name = "Meherin Sultana";
        s1.roolNumber = 121 ;
        s1.marks[0] = 85;
        s1.marks[1] = 78;
        s1.marks[2] = 90;
        s1.marks[3] = 88;
        s1.marks[4] = 76;
     
        s1.displayDetails();

    }
}
/*
--------------------------------------------------------------
Name: Meherin Sultana
Roll No.: 121
Marks: 85 78 90 88 76 
Average: 83.4
Grade: A
--------------------------------------------------------------
 */