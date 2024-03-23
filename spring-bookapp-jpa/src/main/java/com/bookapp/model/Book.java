package com.bookapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

// spring converts this into a table
@Entity
//@Table("book_details")   to provide a diff table name
//name is the name fo the query and use jpql for query
@NamedQuery(name="showBooksAuthTit",
            query="from  Book b where b.author=?1 and b.title=?2")

public class Book {
	private String title;
	private String author;
	@Id // identified as primary key
	@GeneratedValue // spring creates a seq called domain modelname_seq
	private Integer bookId;
	@Column(name = "cost")  // to give a different column name
	private double price;
	private String category;
	
	public Book() {
		super();
	}
	
	public Book(String title, String author, double price,String category) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	public Book(String title, String author, Integer bookId, double price,String category) {
		super();
		this.title = title;
		this.author = author;
		this.bookId = bookId;
		this.price = price;
		this.category = category;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bookId=" + bookId + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
	
}
