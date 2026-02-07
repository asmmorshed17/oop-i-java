/*
6. Product Discount Calculator
• Create a Product class with fields: name, price, discountPercentage.

• Assign values directly in main.
• Write a method calculateDiscountedPrice() to print the price after discount.
*/
class Product{
	String name ;
	double price ;
	double discountPercentage;
	
	void calculateDiscountedPrice(){
		double discount_amount = (price*discountPercentage)/100;
		double discounted_price = price - discount_amount ;
		
		System.out.println("Product: "+name);
	    System.out.println("Original Price: "+price+" BDT.");
        System.out.println("Discount: "+discountPercentage+" %");
        System.out.println("Price after discount: " +discounted_price+" BDT.");		
	}
	
}

class Tester6{
	public static void main(String[]args){
		
		Product p1 = new Product();
		Product p2 = new Product();
		p1.name = "Laptop" ;
		p1.price = 47000 ;
		System.out.println("----------------------------------------");
		p1.discountPercentage = 10; //10% discount ;
		
		p1.calculateDiscountedPrice();
		System.out.println("----------------------------------------");
		p2.name = "Smartphone";
		p2.price = 12790;
		p2.discountPercentage=17 ;//15% discount
		p2.calculateDiscountedPrice();
		System.out.println("----------------------------------------");
	
	
	}
}
/*
E:\Code\Java\NN Mam Class>javac Tester6.java

E:\Code\Java\NN Mam Class>java Tester6
----------------------------------------
Product: Laptop
Original Price: 47000.0 BDT.
Discount: 10.0 %
Price after discount: 42300.0 BDT.
----------------------------------------
Product: Smartphone
Original Price: 12790.0 BDT.
Discount: 17.0 %
Price after discount: 10615.7 BDT.
----------------------------------------
*/