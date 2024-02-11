package com.apis.lang;

public class CloneDemo {

	public static void main(String[] args) {
		Address address = new Address("Bangalore");
		Student student1 = new Student("Jose", 10, address);
		Student estudent = student1;
		// call clone method to clone this
		try {
			Student student2 =  student1.clone();
			System.out.println(student2);
			System.out.println(student2 == student1); //false
			System.out.println(estudent == student1); //true
			System.out.println(student1.getClass() == student2.getClass()); // true
			
			 student2.setStudentId(20);
			 Address address2 = student2.getAddress();
//			 address2.setCity("Mangalore");
//			 student2.setAddress(address2);
			 System.out.println("Student1 "+student1);
			 System.out.println("Student2 "+student2);
			
			
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
		}

	}
}
