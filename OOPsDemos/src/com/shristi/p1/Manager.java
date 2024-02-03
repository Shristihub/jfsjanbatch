package com.shristi.p1;

public class Manager extends Employee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.greet();
		Manager man = new Manager();
		man.greet();
	}
}