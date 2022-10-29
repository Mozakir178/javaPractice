package com.assienment.problem4;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>() ;
	
	public void addBook(Book book) {
		bookList.add(book) ;
	}
	public boolean isEmpty() {
		return bookList.size()==0 ;
	}
	
	public List<Book> viewAllBooks(){
		return bookList ;
	}
	
	public List<Book> viewBooksByAuthor(String author){
		
		List<Book> author1 = new ArrayList<Book>() ;
		
		for(int i=0;i<this.bookList.size();i++) {
			if(this.bookList.get(i).getAuthor().equalsIgnoreCase(author)) {
				author1.add(this.bookList.get(i)) ;
			}
		}
		
		return author1 ;
		
	}
	
	public int countNoOfBooks(String bookName) {
		int count = 0 ;
		
		for(int i=0;i<this.bookList.size();i++) {
			if(this.bookList.get(i).getBookName().equals(bookName)) {
				count++ ;
			}
		}
		return count ;
	}
	
	
	
	
}
