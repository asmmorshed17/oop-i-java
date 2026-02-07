class Car{
String brand ;
String model ;
String year ;
	Car(String Brand,String Model,String Year){
		brand = Brand ;
		model = Model ;
		year = Year ;
	}
public void displayInfo(){
	System.out.println("-----------------------------------------------------");
	System.out.println("All Details: ");
	System.out.println("Car Brand	: "+brand);
	System.out.println("Car Model	: "+model);
	System.out.println("Car Year	: "+year);
	

}	
	
}

class TesterC1{
	public static void main(String[]args){
		Car c1 = new Car("Toyota","TXRA - 25RS-X-COROLA","2022");
		Car c2 = new Car("Mercades","X-ORA-ZES09-RS","2019");
		
		c1.displayInfo();
		c2.displayInfo();
		System.out.println("-----------------------------------------------------");
	}

}

/*
E:\Code\Java\NN Mam Class>javac TesterC1.java

E:\Code\Java\NN Mam Class>java TesterC1
-----------------------------------------------------
All Details:
Car Brand       : Toyota
Car Model       : TXRA - 25RS-X-COROLA
Car Year        : 2022
-----------------------------------------------------
All Details:
Car Brand       : Mercades
Car Model       : X-ORA-ZES09-RS
Car Year        : 2019
-----------------------------------------------------
*/