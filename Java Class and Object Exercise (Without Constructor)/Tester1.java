class Car{
String brand ;
String model ;
String year ;

public void displayInfo(){
	System.out.println("-----------------------------------------------------");
	System.out.println("All Details: ");
	System.out.println("Car Brand	: "+brand);
	System.out.println("Car Model	: "+model);
	System.out.println("Car Year	: "+year);
	
  
}	
	
}

class Tester1{
	public static void main(String[]args){
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.brand = "Toyota";
		c1.model = "TXRA - 25RS-X-COROLA";
		c1.year = "2022" ;
		
		c2.brand = "Mercedes";
		c2.model = "X-ORA-ZES09-RS";
		c2.year = "2019";
		
		c1.displayInfo();
		c2.displayInfo();
		System.out.println("-----------------------------------------------------");
	}

}

/*
E:\Code\Java\NN Mam Class>javac Tester1.java

E:\Code\Java\NN Mam Class>java Tester1
-----------------------------------------------------
All Details:
Car Brand       : Toyota
Car Model       : TXRA - 25RS-X-COROLA
Car Year        : 2022
-----------------------------------------------------
All Details:
Car Brand       : Mercedes
Car Model       : X-ORA-ZES09-RS
Car Year        : 2019
-----------------------------------------------------
*/