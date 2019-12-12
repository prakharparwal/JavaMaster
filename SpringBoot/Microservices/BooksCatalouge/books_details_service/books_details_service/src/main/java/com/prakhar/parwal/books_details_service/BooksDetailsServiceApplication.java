package com.prakhar.parwal.books_details_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.prakhar.parwal.controllers")
@SpringBootApplication
public class BooksDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksDetailsServiceApplication.class, args);
	}

}
