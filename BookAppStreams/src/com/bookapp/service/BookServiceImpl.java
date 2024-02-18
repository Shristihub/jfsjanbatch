package com.bookapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

public class BookServiceImpl implements IBookService {

	@Override
	public List<Book> getAll() {
		List<Book> books = BookDetails.showBooks();
		List<Book> bookList =books.stream()
							.sorted((o1,o2)->o1.getTitle().compareTo(o2.getTitle()))
							.collect(Collectors.toList());
		return bookList;
	}

	@Override
	public List<Book> getByAuthor(String author) throws BookNotFoundException {
		// filter,sorted
		List<Book> books = BookDetails.showBooks();
		List<Book> bookList =books.stream()
								  .filter(book->book.getAuthor().startsWith(author))
                                  .sorted((o1,o2)->{
                                	  Double price1 = o1.getPrice();
                                	  return price1.compareTo(o2.getPrice());
                                  })
                                  .collect(Collectors.toList());
		
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book by this author not found");
		}

		return bookList;
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books = BookDetails.showBooks();
		List<Book> bookList =books.stream()
								  .filter(book->book.getPrice()<price)
								  .sorted((o1,o2)-> ((Double)(o1.getPrice())).compareTo(price))
								  .collect(Collectors.toList());
		if(bookList.isEmpty()) {
			throw new BookNotFoundException("Book lesser than this price not found");
		}
		return bookList;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		List<Book> books = BookDetails.showBooks();
		Book nbook = books.stream()
			.filter(book->book.getBookId()==bookId)
			.findFirst()
			.orElseThrow(()->new IdNotFoundException("Invalid id"));
		return nbook;
	}

	@Override
	public List<String> getTitlesByAuthor(String author) throws BookNotFoundException {
		// filter, sorted, map, collect
		List<Book> books = BookDetails.showBooks();
		List<String> bookTitles =books.stream()
				 				  .filter(book->book.getAuthor().startsWith(author))
				 				  .map(book->book.getTitle())
				 				  .sorted()
				 				 .collect(Collectors.toList());
		
		if(bookTitles.isEmpty()) {
		  throw new BookNotFoundException("Book lesser than this price not found");
		}
		return bookTitles;
	}


}
