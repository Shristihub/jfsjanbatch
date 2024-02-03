package com.shristi.encap;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("Spring",1000,1,false);
//		book.setTitle("Java");
//		book.setPrice(1000);
//		book.setBookId(10);
//		book.setAvailable(true);
		System.out.println("Title "+book.getTitle());
		System.out.println("Price "+book.getPrice());
		System.out.println("BookId "+book.getBookId());
		System.out.println("Available "+book.isAvailable());
		System.out.println(book);
		
	}
}

