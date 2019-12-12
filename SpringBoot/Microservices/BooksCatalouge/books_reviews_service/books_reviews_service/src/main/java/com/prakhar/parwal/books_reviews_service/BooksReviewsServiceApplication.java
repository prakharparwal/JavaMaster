package com.prakhar.parwal.books_reviews_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.prakhar.parwal.controllers")
@SpringBootApplication
public class BooksReviewsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksReviewsServiceApplication.class, args);
	}

}
