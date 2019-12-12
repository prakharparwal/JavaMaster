package com.prakhar.parwal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.prakhar.pawal.resouce.BooksReviewResouce;

@RestController
public class BooksReviewController {

	@GetMapping("/reviews/{userId}/{bookId}")
	public int getRating(@PathVariable("userId")int userId,@PathVariable("bookId") int bookId) {
		
		return new BooksReviewResouce().getBookReviewByPerson().get(userId).get(bookId);
		
	}
}
