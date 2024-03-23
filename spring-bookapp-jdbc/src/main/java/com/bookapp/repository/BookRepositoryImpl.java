package com.bookapp.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

// from here connect to db
@Repository
public class BookRepositoryImpl implements IBookRepository {

	// add JdbcTemplate as asn instance variable
	// use constr based DI
	private JdbcTemplate jdbcTemplate;

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void addBook(Book book) {
		Object[] bookArr = {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.INSERTQUERY, bookArr);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY, price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);
		
	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		Book book = jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY, mapper,bookId);
		return book;
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books =  jdbcTemplate.query(Queries.SELECTQUERY, mapper);
		return books;
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, (rs, rowNum) ->{
			Book book =  new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		}, author);
		
		return books;
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, (rs, rowNum) ->{
			Book book =  new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		}, price);
		
		return books;
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY,new BookMapper(), author,category);
		
		return books;
	}
	
	

}
