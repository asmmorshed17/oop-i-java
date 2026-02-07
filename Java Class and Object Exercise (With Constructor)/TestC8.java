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

    CartItem(String itemName,double unitPrice,int quantity){
            this.itemName = itemName ;
            this.unitPrice = unitPrice ;
            this.quantity = quantity ;
    }

    void display()
    {
        System.out.println("Item Name: "+itemName);
        System.out.println("Unitprice = "+unitPrice);
        System.out.println("Quantity = "+quantity);
        System.out.println("Total Costing = "+(unitPrice*quantity));
        System.out.println("--------------------------------------------------"); 
    }
}


public class TestC8 {
    public static void main(String[] args) {
       CartItem c1 = new CartItem("Laptop",29900,5);
        CartItem c2 = new CartItem("Notepad",45500,7);

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
