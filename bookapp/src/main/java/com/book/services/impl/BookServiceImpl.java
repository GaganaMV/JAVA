package com.book.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Book;
import com.book.repository.BookRepository;
import com.book.services.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book insertBook(Book book) {
		
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepository.findAll();
		
	}

	@Override
	public Book getBookById(long id) {
	    return bookRepository.findById(id).get();
	}

	@Override
	public Book updateBook(Book book,long id) {
		book.setBookId(id);
		return bookRepository.save(book);
		
	}

	@Override
	public void deleteBook(long id) {
		Book delete = bookRepository.findById(id).get();
		bookRepository.delete(delete);
	}

}
