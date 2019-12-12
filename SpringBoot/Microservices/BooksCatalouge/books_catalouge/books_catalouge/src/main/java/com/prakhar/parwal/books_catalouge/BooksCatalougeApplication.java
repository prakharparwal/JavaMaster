package com.prakhar.parwal.books_catalouge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.prakhar.parwal.controllers")
@SpringBootApplication
public class BooksCatalougeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksCatalougeApplication.class, args);
	}

}
