/*
9. Library Member
• Create a LibraryMember class with fields: memberName, membershipType,
booksBorrowed.
• Assign values directly in main.
• Write methods borrowBook() and returnBook() to update booksBorrowed.
• Display updated status.
 */

class LibraryMember{
    String memberName ;
    String membershipType;
    int booksBorrowed;

    //Method to borrow a book
    void borrowBook(){
        booksBorrowed++ ;
        System.out.println(memberName + " borrowed a book. Total borrowed: " +booksBorrowed);
    }

    //Method to return a book
    void returnBook(){
        if(booksBorrowed>0){
        booksBorrowed--;
        System.out.println(memberName +" returned a book. Total borrowed: "+booksBorrowed);
      }
      else{
        System.out.println(memberName + " has no book to return.");
      }
    }
    
    //Method to display member status
    void displayStatus(){
        System.out.println("Member Name: "+memberName);
        System.out.println("Membership Type: "+membershipType);
        System.out.println("Books Borrowed: "+booksBorrowed);
        System.out.println("---------------------------------------------------------");
    }
    

}


//Main Class (LibraryTest)
public class Test9 {

    public static void main(String[] args) {
        
        //Creating Object
        LibraryMember member1 = new LibraryMember();

        //Assigning values directly
        member1.memberName = "Amelia";
        member1.membershipType = "Premium";
        member1.booksBorrowed = 0;

        System.out.println("---------------------------------------------------------");
        //display initial status
        member1.displayStatus();

        //Borrow and return books
        member1.borrowBook();
        member1.borrowBook();
        member1.returnBook();

        System.out.println("---------------------------------------------------------");
        //Dispaly updated status
        member1.displayStatus();

    }
}
/*
--------------------------------------------------------
Member Name: Amelia
Membership Type: Premium
Books Borrowed: 0
---------------------------------------------------------
Amelia borrowed a book. Total borrowed: 1
Amelia borrowed a book. Total borrowed: 2
Amelia returned a book. Total borrowed: 1
---------------------------------------------------------
Member Name: Amelia
Membership Type: Premium
Books Borrowed: 1
---------------------------------------------------------
 */