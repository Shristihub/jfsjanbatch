package com.shristi.encap;

public class Emp {

	protected String name;
	protected int empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
}

class Manager extends Emp{
	private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.setName(null);
		manager.name = "Ram";
		manager.empId = 90;
		
	}
}

