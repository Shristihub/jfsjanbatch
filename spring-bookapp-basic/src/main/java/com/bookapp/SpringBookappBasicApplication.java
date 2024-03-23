package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappBasicApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}

	@Autowired
	private IBookService bookService;
	@Override
	public void run(String... args) throws Exception {
		bookService.getAll().forEach(System.out::println);
		System.out.println();
		bookService.getByAuthor("Kathy").forEach(System.out::println);
		
	}

}
