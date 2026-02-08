
/*
Exercise 11: Shopping Cart
Create a class ShoppingCart:
• Private field: ArrayList<Product> items.
• Provide constructor.
-------------------------------------------------------------------------
• Add methods:
o addItem(Product p)
o removeItem(String productId)
o getTotalCost() – calculate and return total.
o printCart() – show all items in the cart.
• In the main method, create products, add them to a shopping cart, and calculate
total cost.

*/

import java.util.ArrayList;

// Product class (from previous Exercise 7)
class Product {

    private String id;
    private String name;
    private double price;
    private int quantity;

    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = (price >= 0) ? price : 0;
        this.quantity = (quantity >= 0) ? quantity : 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}

// ShoppingCart class
class ShoppingCart {

    private ArrayList<Product> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add item to cart
    public void addItem(Product p) {
        items.add(p);
        System.out.println(p.getName() + " added to cart.");
    }

    // Remove item by product ID
    public void removeItem(String productId) {
        boolean removed = items.removeIf(p -> p.getId().equals(productId));
        if (removed) {
            System.out.println("Product " + productId + " removed from cart.");
        } else {
            System.out.println("Product " + productId + " not found in cart.");
        }
    }

    // Calculate total cost
    public double getTotalCost() {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    // Print cart details
    public void printCart() {
        System.out.println("Shopping Cart Items:");
        for (Product p : items) {
            p.printDetails();
        }
        System.out.println("Total Cost: " + getTotalCost());
    }
}

// Main class
public class ShoppingCartTest {
    public static void main(String[] args) {

        Product p1 = new Product("P001", "Laptop", 55000, 1);
        Product p2 = new Product("P002", "Mouse", 800, 2);
        Product p3 = new Product("P003", "Keyboard", 1500, 1);

        ShoppingCart cart = new ShoppingCart();

        cart.addItem(p1);
        cart.addItem(p2);
        cart.addItem(p3);

        System.out.println();

        cart.printCart();

        System.out.println();

        cart.removeItem("P002"); // Remove Mouse
        cart.printCart();
    }
}

/*
Laptop added to cart.
Mouse added to cart.
Keyboard added to cart.

Shopping Cart Items:
ID: P001, Name: Laptop, Price: 55000.0, Quantity: 1
ID: P002, Name: Mouse, Price: 800.0, Quantity: 2
ID: P003, Name: Keyboard, Price: 1500.0, Quantity: 1
Total Cost: 58100.0

Product P002 removed from cart.
Shopping Cart Items:
ID: P001, Name: Laptop, Price: 55000.0, Quantity: 1
ID: P003, Name: Keyboard, Price: 1500.0, Quantity: 1
Total Cost: 56500.0
 */