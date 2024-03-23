package com.bookapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookDb {
	// add methods to open and close connection
	static  Connection connection;
	
	public static Connection openConnection() {
		 String url = "jdbc:mysql://localhost:3306/jfsjanbatch";
		 String username="root";
		 String password="root";
		 try{
			 connection = DriverManager.getConnection(url, username, password);
		 }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
		 return connection;
	}
	
}
