package com.shristi.basics;

public class Employee {

	String employeeName; // null
	int employeeId; //0
	double salary; //0.0
	
	
	public Employee(String employeeName, int employeeId, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	void getDetails() {
		System.out.println(employeeName);
		System.out.println(employeeId);
		System.out.println(salary);
	}
	
	String greet(String message){
		String res = message+employeeName;
		return res;
	}
	
}
