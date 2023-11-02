package com.maven.junitmavenproject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookService {
	
	List<Book> listOFBooks =new ArrayList<Book>();
	
	
	public void addBook(Book book) {
		listOFBooks.add(book);
	}
	
	public List<Book> books(){
		return  (List<Book>) Collections.unmodifiableCollection(listOFBooks);
		 
	}

	public Book getBookById(String bookId) {
		for(Book book:listOFBooks) {
			if(book.equals(book.getBookId())) {
				return book;
			}
		}
		return null;	
	}
	
	public Book deleteBook(String bookId) {
		Iterator<Book> itr=listOFBooks.iterator();
		while (itr.hasNext()){
		Book books = itr.next();
		if(books.getBookId()==bookId) {
			itr.remove();
			return books;
		}
		
		}
		return null;
	}
	
	public Book updateBookById(String bookId,String newtitle) {
		Iterator<Book> itr=listOFBooks.iterator();
	    while(itr.hasNext()) {
			Book next = itr.next();
			if(next.getBookId()==bookId) {
				next.getBookId();
				next.setTitle(newtitle);
				return next;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
