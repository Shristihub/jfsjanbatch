package com.bookapp.client;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

public class User {

	public static void main(String[] args) {
		IBookService bookService = new BookServiceImpl();
		List<Book> books = bookService.getAll();
		System.out.println("get all books");
		for (Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("Get Books by author");

		try {
			List<Book> booksByAuthor = bookService.getByAuthor("K");
			for (Book book : booksByAuthor) {
				System.out.println(book);
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Get Books by Lesser Price");
		try {
			List<Book> booksByPrice = bookService.getByLesserPrice(600);
			for (Book book : booksByPrice) {
				System.out.println(book);
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Get By Id");
		try {
			Book book = bookService.getById(10);
			System.out.println(book);
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Get titles by author");

		try {
			List<String> bookTitles = bookService.getTitlesByAuthor("R");
			for (String title : bookTitles) {
				System.out.println(title);
			}
		} catch (BookNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
