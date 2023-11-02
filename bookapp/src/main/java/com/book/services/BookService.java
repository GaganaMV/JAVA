package com.book.services;

import java.util.List;

import com.book.entity.Book;

public interface BookService {

	Book insertBook(Book book);

	List<Book> getAllBook();

	Book getBookById(long id);

	Book updateBook(Book book,long id);

	void deleteBook(long id);

}
