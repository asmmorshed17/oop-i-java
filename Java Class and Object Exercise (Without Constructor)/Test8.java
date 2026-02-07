/*
8. Shopping Cart Item
• Create a CartItem class with fields: itemName, unitPrice, quantity.
• Assign values directly in main.
• Write a method to calculate and display the total cost.
 */
class CartItem{
    String itemName;
    double unitPrice ;
    int quantity ;

    void display()
    {
        System.out.println("Item Name: "+itemName);
        System.out.println("Unitprice = "+unitPrice);
        System.out.println("Quantity = "+quantity);
        System.out.println("Total Costing = "+(unitPrice*quantity));
        System.out.println("--------------------------------------------------"); 
    }
}


public class Test8 {
    public static void main(String[] args) {
       CartItem c1 = new CartItem();
        CartItem c2 = new CartItem();

        c1.itemName = "Laptop";
        c1.unitPrice = 29900;
        c1.quantity = 5 ;

        c2.itemName = "Notepad";
        c2.unitPrice = 45500;
        c2.quantity = 7 ;
       
       System.out.println("--------------------------------------------------"); 
       c1.display();
       c2.display();
    }
}

/*
--------------------------------------------------
Item Name: Laptop
Unitprice = 29900.0
Quantity = 5
Total Costing = 149500.0
--------------------------------------------------
Item Name: Notepad
Unitprice = 45500.0
Quantity = 7
Total Costing = 318500.0
--------------------------------------------------
 */