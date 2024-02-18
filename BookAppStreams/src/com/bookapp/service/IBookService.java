package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookService {

	List<Book> getAll();
	List<Book> getByAuthor(String author) throws BookNotFoundException;
	List<Book> getByLesserPrice(double price) throws BookNotFoundException;
	Book getById(int bookId) throws IdNotFoundException;
	List<String> getTitlesByAuthor(String author) throws BookNotFoundException;
}
