package com.maven.junitmavenproject;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestDemo {
	@Test
	public void testBook() {
		BookService bookService =new BookService();
		Book firstBook = new Book("1", "First book", "tanu");
		Book secondBook = new Book("2", "Second Book", "sahana");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		Book findBook = bookService.getBookById("2");
		assertNull(findBook);
	}
	
	
	@Test
	public void testBookMessage() {
		BookService bookService =new BookService();
		Book firstBook = new Book("1", "First book", "tanu");
		Book secondBook = new Book("2", "Second Book", "sahana");
		bookService.addBook(firstBook);
		bookService.addBook(secondBook);
		assertSame(firstBook, firstBook);
		
	}
	
	@Test
	public void testDelete() {
		BookService book =new BookService();
		Book firstBook = new Book("1", "First book", "tanu");
		Book secondBook = new Book("2", "Second Book", "sahana");
		
		book.addBook(secondBook);
		Book deleteBook = book.deleteBook("1");
		assertNotNull(firstBook);
		assertNull(deleteBook);
	}
	
	@Test
	public void testUpdate() {
		BookService book =new BookService();
		Book firstBook = new Book("1", "First book", "tanu");
		book.updateBookById("1","new Book");
		assertNotEquals("new Book", firstBook);
	}
	
	
	
	

}
