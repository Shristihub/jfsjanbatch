package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJpaApplication.class, args);
	}

	private IBookService bookService;
	
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}


	@Override
	public void run(String... args) throws Exception {
		// create a book object and call addBook method of Ibookservice
		Book book = new Book("Captain","Tom",550,"fiction");
//		bookService.addBook(book);
		
		Book book1 = new Book("Laws of world","Steve",780,"fiction");
//		bookService.addBook(book1);
		
		Book nbook = bookService.getById(2);
//		System.out.println(nbook);
		
		nbook.setAuthor("RodJohn");
		nbook.setPrice(1800);
//		bookService.updateBook(nbook);
	
//		bookService.getAll().forEach(System.out::println);
		
		
		bookService.getByAuthor("R").forEach(System.out::println);
		System.out.println();
		System.out.println("Books by price");
		bookService.getByLesserPrice(1000).forEach(System.out::println);
		System.out.println();
		System.out.println("Books By auth cat");
		bookService.getByAuthorCategory("Robin","selfhelp").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Books By auth titl");
		bookService.getByAuthTitle("Robin","leadership").forEach(System.out::println);
		
		System.out.println();
		System.out.println("Books By  titles");
		bookService.getBooksByTitles ("l").forEach(System.out::println);
		
	}

}











