package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
	
	@Autowired
	private IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
//		bookService.addBook(new Book("Microservices","James",3100,"Tech"));
//		bookService.updateBook(6, 2000);
//		bookService.deleteBook(9);
		
		System.out.println();
		bookService.getAll().forEach(System.out::println);
		System.out.println();
		bookService.getByAuthor("Robin").forEach(System.out::println);
		System.out.println();
		bookService.getByLesserPrice(2000).forEach(System.out::println);
		System.out.println();
		System.out.println(bookService.getById(1));
	}

}
