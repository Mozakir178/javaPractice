package com.assienment.problem4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Library library = new Library() ;
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("\nEnter the number which operation you want to perform:");
		System.out.println("1. Add Book \n2. Display all book details \n3. Search Book by author \n4. Count number of books - by book name \n5. Exit \nEnter Your Choice");
		while(true) {
			int choice = sc.nextInt() ;
			
			if( choice==1) {
				System.out.println("Enter the isbn no :");
				int isbn = sc.nextInt() ;
				sc.nextLine() ;
				System.out.println("Enter the book name : ");
				String bookName = sc.nextLine() ;
				System.out.println("Enter the author name : ");
				String authorName = sc.nextLine() ;
				
				Book book = new Book() ;
				book.setIsbn(isbn);
				book.setBookName(bookName);
				book.setAuthor(authorName);
				library.bookList.add(book) ;
				System.out.println("Book added successfully");
			
			}
			
			else if(choice ==2) {
				
				System.out.println(library.viewAllBooks()); 
			
			}
			
			else if(choice ==3) {
				sc.nextLine() ;
				System.out.println("Enter the name of author");
				String author = sc.nextLine() ;
				List<Book> book = library.viewBooksByAuthor(author) ;
				if(book.size() == 0) {
					System.out.println("There is no book written by the author");
				}
				else {
					System.out.println(book);
				}
			
			}
			
			else if(choice ==4) {
				sc.nextLine()  ;
				System.out.println("Enter the name of book");
				String bookName = sc.nextLine() ;
				int count = library.countNoOfBooks(bookName) ;
				if(count==0) {
					System.out.println("There is no book with that name");
				}
				else ;
				System.out.println(count);
			}
			else if(choice == 5) {
				System.out.println("Thank you");
				break ;
			}
			else {
				System.out.println("Enter proper details");
			}
			
			System.out.println("\n\nEnter the number which operation you want to perform:");
			System.out.println("1. Add Book \n2. Display all book details \n3. Search Book by author \n4. Count number of books - by book name \n5. Exit \nEnter Your Choice");
			
		}
		sc.close(); 
	}
}
