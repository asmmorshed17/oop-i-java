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
	
	void showBook(){
		System.out.println("Book Title	: "+title);
		System.out.println("Book Author	: "+author);
		System.out.println("Book Price	: "+price);
		System.out.println("------------------------------------------------------------------");
	}
}

class Tester4{
	public static void main(String[] args){
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.title = "Daruchini Dip";
		b1.author = "Humayon Ahmed";
		b1.price = 230;
		
		b2.title = "Hayater Din Purale";
		b2.author = "Arif Azad";
		b2.price = 350;
		
		b3.title = "Need English Grammar";
		b3.author = "Md. Rafiq";
		b3.price = 500;
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("BOOK DETAILS INFORMATION.");
		System.out.println("------------------------------------------------------------------");
		b1.showBook();
		b2.showBook();
		b3.showBook();
		
	}
}

/*
E:\Code\Java\NN Mam Class>javac Tester4.java

E:\Code\Java\NN Mam Class>java Tester4

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
