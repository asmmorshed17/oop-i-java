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
	Product(String n,double prc,double disPer){
		name = n ;
		price = prc ;
		discountPercentage = disPer ;
		}
	
	void calculateDiscountedPrice(){
		double discount_amount = (price*discountPercentage)/100;
		double discounted_price = price - discount_amount ;
		
		System.out.println("Product: "+name);
	    System.out.println("Original Price: "+price+" BDT.");
        System.out.println("Discount: "+discountPercentage+" %");
        System.out.println("Price after discount: " +discounted_price+" BDT.");	
        System.out.println("----------------------------------------");		
	}
	
}

class TesterC6{
	public static void main(String[]args){
		
		Product p1 = new Product("Laptop",47000,10);
		Product p2 = new Product("Smartphone",12790,17);
		System.out.println("----------------------------------------");
		
		p1.calculateDiscountedPrice();
		p2.calculateDiscountedPrice();
	
	
	}
}
/*
E:\Code\Java\NN Mam Class>javac TesterC6.java

E:\Code\Java\NN Mam Class>java TesterC6
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