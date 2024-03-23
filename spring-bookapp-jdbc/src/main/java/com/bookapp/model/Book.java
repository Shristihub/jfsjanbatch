package com.bookapp.model;

public class Book {
	private String title;
	private String author;
	private Integer bookId;
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
