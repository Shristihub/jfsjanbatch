package com.shristi.encap;

public class Book {
 
	private String title;
	private double price;
	private Integer bookId;
	private boolean available;
	
	public Book() {
		super();
	}
	
	public Book(String title, double price, Integer bookId, boolean available) {
		super();
		this.title = title;
		this.price = price;
		this.bookId = bookId;
		this.available = available;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", bookId=" + bookId + ", available=" + available + "]";
	}
	
	
	
	
}
