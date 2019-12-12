package com.prakhar.parwal.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.parwal.data.Book;
import com.prakhar.parwal.resource.BookResource;

@RestController
public class BooksDetailsController {

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		System.out.println("Request came here ");
		return new BookResource().getAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBookById(@PathVariable("bookId") int id) {
		
		return new BookResource().getAllBooks().get(id);
	}
	
	/*
	 * public List<Book> getBooksByIds(List<Integer> ids) {
	 * 
	 * return new BookResource().getAllBooks().stream().forEach(action); }
	 */
	
}
