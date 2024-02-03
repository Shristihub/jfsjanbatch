package com.shristi.p1;

public class Employee {

	protected void greet() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.greet();
	}
}
