package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.services.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/insert")
	public Book insertBook(@RequestBody Book book) {
		return bookService.insertBook(book);
	}
	
	@GetMapping("/getAll")
	public List<Book> getAllBooks(){
		return bookService.getAllBook();
		
	}
	
	@GetMapping("/getById/{id}")
	public Book getBookById(@PathVariable long id) {
		return bookService.getBookById(id);
	}
	
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable long id) {
		return bookService.updateBook(book,id);
	}
	
	@DeleteMapping("/delete")
	public String deleteBook(@PathVariable long id) {
		return "Data deleted Successfullys";
	}

}
