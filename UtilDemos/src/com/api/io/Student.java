package com.api.io;

import java.io.Serializable;

public class Student implements Serializable{

	private String studentName;
	private int studentId;
	private String department;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentId, String department) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.department = department;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", department=" + department + "]";
	}
	
	
}
