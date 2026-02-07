/*
4. Book Information
• Create a Book class with fields: title, author, price.
• In the main method, create three Book objects and assign values directly.
• Display all book details using a method showBook().
*/

class Book{
	String title ;
	String author ;
	double price ;
	
	//Constructor: 
	Book(String t,String au,double pr){
		title = t ;
		author = au ;
		price = pr ;
	}
	void showBook(){
		System.out.println("Book Title	: "+title);
		System.out.println("Book Author	: "+author);
		System.out.println("Book Price	: "+price);
		System.out.println("------------------------------------------------------------------");
	}
}

class TesterC4{
	public static void main(String[] args){
		Book b1 = new Book("Daruchini Dip","Humayon Ahmed",230);
		Book b2 = new Book("Hayater Din Purale","Arif Azad",350);
		Book b3 = new Book("Need English Grammar","Md. Rafiq",500);
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("BOOK DETAILS INFORMATION.");
		System.out.println("------------------------------------------------------------------");
		b1.showBook();
		b2.showBook();
		b3.showBook();
		
	}
}
/*
E:\Code\Java\NN Mam Class>javac TesterC4.java

E:\Code\Java\NN Mam Class>java TesterC4
------------------------------------------------------------------
BOOK DETAILS INFORMATION.
------------------------------------------------------------------
Book Title      : Daruchini Dip
Book Author     : Humayon Ahmed
Book Price      : 230.0
------------------------------------------------------------------
Book Title      : Hayater Din Purale
Book Author     : Arif Azad
Book Price      : 350.0
------------------------------------------------------------------
Book Title      : Need English Grammar
Book Author     : Md. Rafiq
Book Price      : 500.0
------------------------------------------------------------------
*/