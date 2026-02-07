/*
 * 12. Online Shopping Cart
• Create a Product class with fields: name, price, quantity.
• Add methods:
o totalPrice() → returns price * quantity.
• In main, create an array of 3 products, calculate each product’s total price, and sum all for
the cart total.
 */

 class Product{
   String name ;
   double price ;
   int quantity ;

   //Constructor: 
   Product(String name,double price ,int quantity){
    this.name = name ;
    this.price = price ;
    this.quantity = quantity ;
   }
   double totalPrice(){
       return price*quantity ;
   }
 }

 
 public class TesterC12{
    public static void main(String[] args) {
       
      //Create an array of 3 Products
      Product[] cart = new Product[3] ;

      //assign products using constructor
      cart[0] = new Product("Laptop",75000,5);
      cart[1] = new Product("Headphone",2370,7);
      cart[2] = new Product("Mouse",1250,3);

      double cartTotal = 0;
      System.out.println("-------------------------------------------------------------");
      
      //Print product details and calculate cart Total
      for(int i=0;i<cart.length ;i++){

        double total = cart[i].totalPrice();

        System.out.println(cart[i].name + " x " + cart[i].quantity + " = " +total + " Tk.");
        cartTotal += total ;

      }
      System.out.print("-------------------------------------------------------------");

      System.out.println("\nCart Total = "+cartTotal +" Tk.");
      System.out.println("-------------------------------------------------------------");

    }
 }