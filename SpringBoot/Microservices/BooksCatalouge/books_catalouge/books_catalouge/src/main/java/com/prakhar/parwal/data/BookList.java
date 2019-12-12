package com.prakhar.parwal.data;

import java.util.List;

public class BookList {

	private List<Book> books;

	public BookList(List<Book> books) {
		super();
		this.books = books;
	}

	public BookList() {
		super();
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
