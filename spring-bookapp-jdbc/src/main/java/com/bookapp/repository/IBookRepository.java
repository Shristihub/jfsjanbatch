package com.bookapp.repository;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookRepository {

	// admin
	void addBook(Book book); // create
	void updateBook(int bookId, double price); // update
	void deleteBook(int bookId); // delete
	Book findById(int bookId) throws IdNotFoundException; // retrieve

	// User
	List<Book> findAll(); // retrieve
	List<Book> findByAuthor(String author) throws BookNotFoundException;
	List<Book> findByLesserPrice(double price) throws BookNotFoundException;
	List<Book> findByAuthorCategory(String author,String category) throws BookNotFoundException;
	

}
