/*
Circle Area & Circumference
• Create a Circle class with a field: radius.
• Assign value directly.
• Write methods to calculate and display the area and circumference.
*/

class Circle{
	//double radi ;
	
	void area(double radius){
		System.out.println("Area of Circle = "+(3.1416*radius*radius));
	}
	
	void circumference(double radius){
		System.out.println("Circumference of Circle = "+ (2*(3.1416)*radius));
	}
}

class Tester8{
	public static void main(String[]args){
		Circle c1  = new Circle();
		Circle c2 = new Circle();
		
		c1.area(12);
		c1.circumference(12);
		c2.area(20);
		c2.circumference(20);
		
	}
}