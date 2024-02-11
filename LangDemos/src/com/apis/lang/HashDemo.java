package com.apis.lang;

public class HashDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee("Jo", 10, "Admin", "Bangalore");
		Employee e2 = new Employee("Jo", 10, "Admin", "Chennai");
		Employee e3 = new Employee("Jo", 10, "Production", "Bangalore");
		Employee e4 = new Employee("John", 10, "Admin", "Bangalore");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		
		
		
	}
}
