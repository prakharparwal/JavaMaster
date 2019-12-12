package com.prakhar.parwal.resource;

import java.util.ArrayList;
import java.util.List;

import com.prakhar.parwal.data.Book;

public class BookResource {

	public List<Book> getAllBooks() {
		
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Book1", "Author1"));
		books.add(new Book(2, "Book2", "Author2"));
		books.add(new Book(3, "Book3", "Author3"));
		
		return books;
	}
}
