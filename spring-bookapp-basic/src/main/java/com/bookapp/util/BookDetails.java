package com.bookapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookapp.model.Book;

@Component
public class BookDetails {
	
	public List<Book> showBooks(){
		return  Arrays.asList(
				new Book("Java","Kathy",1,1200.3),
				new Book("JSP","Kathy",2,200.3),
				new Book("HTML","Kevin",3,450.7),
				new Book("Leadership","Robin",4,657.0),
				new Book("5 am club","Robin",5,878.10),
				new Book("Secret","Rhonda",6,600.3)
		);
//		return bookList;
	}

}
