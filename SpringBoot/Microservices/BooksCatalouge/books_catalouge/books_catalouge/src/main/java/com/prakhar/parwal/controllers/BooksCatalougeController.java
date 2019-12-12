package com.prakhar.parwal.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.prakhar.parwal.data.Book;

@RestController
public class BooksCatalougeController {

	@GetMapping("/books-catalouge/{userId}")
	public void getBooksCatalougeByUser(@PathVariable("userId")int userId) {
		
		System.out.println("Request came for books catalouge read by user: "+userId);
		
		RestTemplate restTemplate = new RestTemplate();
		Book book = restTemplate.getForObject("http://localhost:8082/books/2", Book.class);
	
		System.out.println(book.getId()+book.getName()+book.getAuthor());
		
	}
}
