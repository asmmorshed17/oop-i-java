
/*
Exercise 7: Product Inventory
Create a class Product:
• Private fields: id (String), name (String), price (double), quantity (int).
• Provide constructors, getters, and setters (price and quantity must be nonnegative).

• Add methods:
o increaseStock(int amount) – adds to quantity.
o decreaseStock(int amount) – reduces quantity if enough stock is available.
o printDetails() – prints product info.
• In the main method, simulate stock updates for multiple products.
 */

class Product {

    // Private fields
    private String id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price! Setting to 0.");
            this.price = 0;
        }

        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity! Setting to 0.");
            this.quantity = 0;
        }
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity!");
        }
    }

    // Increase stock
    public void increaseStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println(amount + " units added to stock.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    // Decrease stock
    public void decreaseStock(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " units removed from stock.");
        } else {
            System.out.println("Not enough stock or invalid amount!");
        }
    }

    // Print product details
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("---------------------------");
    }
}

// Main class
public class InventoryTest {
    public static void main(String[] args) {

        Product p1 = new Product("P001", "Laptop", 55000, 10);
        Product p2 = new Product("P002", "Mouse", 800, 50);

        // Print initial details
        p1.printDetails();
        p2.printDetails();

        // Update stock
        p1.increaseStock(5);
        p1.decreaseStock(12); // Invalid case
        p1.decreaseStock(8);

        p2.increaseStock(10);
        p2.decreaseStock(20);

        // Print final details
        p1.printDetails();
        p2.printDetails();
    }
}


/*
ID: P001
Name: Laptop
Price: 55000.0
Quantity: 10
---------------------------
ID: P002
Name: Mouse
Price: 800.0
Quantity: 50
---------------------------
5 units added to stock.
12 units removed from stock.
Not enough stock or invalid amount!
10 units added to stock.
20 units removed from stock.
ID: P001
Name: Laptop
Price: 55000.0
Quantity: 3
---------------------------
ID: P002
Name: Mouse
Price: 800.0
Quantity: 40
---------------------------

*/