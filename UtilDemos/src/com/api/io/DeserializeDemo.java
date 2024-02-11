package com.api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			fileInputStream = new FileInputStream("trial.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);
			Student student = (Student)objectInputStream.readObject();
			System.out.println(student);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fileInputStream.close();
				objectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
