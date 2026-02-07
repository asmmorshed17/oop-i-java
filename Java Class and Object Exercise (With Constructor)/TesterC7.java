/*
Circle Area & Circumference
• Create a Circle class with a field: radius.
• Assign value directly.
• Write methods to calculate and display the area and circumference.
*/

class Circle{
	double radius ;
	Circle(double radi){
		radius = radi ;
	}
	
	void display(){
		System.out.println("Area of Circle = "+(3.1416*radius*radius));
		System.out.println("Circumference of Circle = "+ (2*(3.1416)*radius));
	}
}

class TesterC7{
	public static void main(String[]args){

		Circle c1  = new Circle(12);
		Circle c2 = new Circle(17.73);
	    System.out.println("First Circle Details.----------------");
		c1.display();
		System.out.println("Second Circle Details.----------------");
		c2.display();
		
	}
}
/*
E:\Code\Java\NN Mam Class>javac TesterC7.java

E:\Code\Java\NN Mam Class>java TesterC7
First Circle Details.----------------
Area of Circle = 452.3904
Circumference of Circle = 75.3984
Second Circle Details.----------------
Area of Circle = 987.57107064
Circumference of Circle = 111.401136
*/