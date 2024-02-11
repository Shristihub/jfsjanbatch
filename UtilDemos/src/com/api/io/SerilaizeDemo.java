package com.api.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilaizeDemo {

	public static void main(String[] args) {
		Student student = new Student("Jo",1,"CSE");
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream =null;
		try {
			fileOutputStream = new FileOutputStream("trial.ser");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fileOutputStream.close();
				objectOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 
		
	}

}
