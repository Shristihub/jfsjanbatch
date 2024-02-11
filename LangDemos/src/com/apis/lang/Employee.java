package com.apis.lang;

import java.util.Objects;

public class Employee {
	private String empName;
	private int empId;
	private String department;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, int empId, String department, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.department = department;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(department, empId, empName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", department=" + department + ", city=" + city
				+ "]";
	}
	

}
