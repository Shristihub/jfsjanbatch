package com.api.list;

public class Employee implements Comparable<Employee>{
	private String empName;
	private int empId;
	private String city;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, int empId, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", city=" + city + "]";
	}

	@Override
	public int compareTo(Employee o) {
//		return this.getEmpName().compareTo(o.getEmpName());
//		return o.getCity().compareTo(this.getCity());
		
		// convert to Integer object
//		Integer  id1 = this.getEmpId();
//		return id1.compareTo(o.getEmpId());
		
		return ((Integer)(this.getEmpId())).compareTo(o.getEmpId());
	}

}





