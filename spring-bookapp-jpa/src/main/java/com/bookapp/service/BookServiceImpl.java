package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBookRepository bookRepository;

	@Override
	public void addBook(Book book) {
		// check if id is coming in the  book object if not generates the id
		//check if id is  coming in the  book object , 
		//if yes, check if that id is in db, if no insert, if yes update
		bookRepository.save(book);
	}

	@Override
	public void updateBook(Book book) {
		//check if id is  coming in the  book object , 
		//if yes, check if that id is in db, if no insert, if yes update
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
//		Optional<Book> optBook = bookRepository.findById(bookId);
//		if(optBook.isEmpty())
//			throw new IdNotFoundException("inavlid id");
//		return optBook.get();
		
		return bookRepository.findById(bookId)
				             .orElseThrow(()-> new IdNotFoundException("invalid id"));
	}

	@Override
	public List<Book> getAll() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
//		return bookRepository.findByAuthor(author);
		return bookRepository.findByAuth(author);
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
//		return bookRepository.getByPriceLessThan(price);
		return bookRepository.getBooksByLesserPrice(price);
		
	}

	@Override
	public List<Book> getByAuthorCategory(String author, String category) throws BookNotFoundException {
//		return bookRepository.readByAuthorAndCategory(author, category);
		return bookRepository.showByAuthCat(author, category);
	}

	@Override
	public List<Book> getByAuthTitle(String author, String title) {
		return bookRepository.showByAuthTitle(author, title);
	}

	@Override
	public List<Book> getBooksByTitles(String title) {
		return bookRepository.getByTitles("%"+title+"%");
	}
	
	

}
