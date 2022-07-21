package oops;
import java.util.Scanner;
/*write a program to create Book management system.
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add atleast 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"*/
//create a public class Book
public class Book {
	//instance variable
	int bookid;
	String bookName;
	float bookPrice;
	String authorName;
	static String  library_name="XYZ Library";//static variable 
	String availability="Avilable";
	public void createBook(int id,String name,float price,String author)// method to store book details
	{
		bookid= id;
		bookName=name;
		bookPrice=price;
		authorName=author;
		
	}
	public void displayBook()// method to display book list  
	{
		
		System.out.println("Book is: "+bookid);
		System.out.println("Book Name: "+bookName);
		System.out.println("Book Price: "+bookPrice);
		System.out.println("Book Author Name: "+authorName);
		System.out.println("Avilabilty Status: "+availability);
		System.out.println("===============================");
	}
//main method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//create the instance of Scanner class
		// create five instance for 5 books 
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		Book b4=new Book();
		Book b5=new Book();
		
		
		System.out.println("*******"+Book.library_name+"*******");
		b1.createBook(101,"The India Story",500.00f,"Bimal Jalal");// call the createBook method
		b1.displayBook();// call the displayBook method
		b2.createBook(102,"TheListen to Your Heart: The London Adventure",450.00f,"Ruskin Bond");// call the createBook method
		b2.displayBook();//call the displayBook method
		b3.createBook(103,"Business of Sports: The Winning Formula for Success",560.00f,"Vinit Karnik");//all the createBook method
		b3.displayBook();//call the displayBook method
		b4.createBook(104,"A Place Called Home",890.00f,"Preeti Shenoy");//all the createBook method
		b4.displayBook();//call the displayBook method
		b5.createBook(105,"Lal Salam",650.00f,"Smriti Irani");//all the createBook method
		b5.displayBook();//call the displayBook method
		
	}

}
