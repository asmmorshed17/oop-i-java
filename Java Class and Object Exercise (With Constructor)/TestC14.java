/*
 * 14. Library Book Issue System
• Create a Book class with fields: title, author, isIssued (boolean).
• Add methods:
o issueBook() → sets isIssued = true if not already issued.
o returnBook() → sets isIssued = false.
• In main, create a book, issue it, try issuing again, return it, then issue again.
 */

class Book{
    String title;
    String author ;
    boolean isIssued;

    Book(String title,String author){
        this.title = title ;
        this.author = author ;
        this.isIssued = false; //initially not issued
    }
    void issueBook(){
        if(!isIssued){
            isIssued = true ;
            System.out.println("Book '"+title +"' issued successfully");
        }
        else{
            System.out.println("Book '"+title+"' is already issued!");
        }
    }

    void returnBook(){
        if(isIssued){
            isIssued = false ;
            System.out.println("Book '"+title+"' returned successfully");
        }
        else{
            System.out.println("Book '" +title+"' was not issued!");
        }
    }
}

public class TestC14 {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code","Robert C.Martin");

        b1.isIssued = false ; //initially not issued

        b1.issueBook();
        b1.issueBook();
        b1.returnBook();
        b1.returnBook();

    }
    
}

/*
Book 'Clean Code' issued successfully
Book 'Clean Code' is already issued!
Book 'Clean Code' returned successfully
Book 'Clean Code' was not issued!
 */