package com.apis.lang;

public class Student implements Cloneable{

	private String studentName;
	private int studentId;
	private Address address;
	public Student(String studentName, int studentId, Address address) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.address = address;
	}
		
	@Override
	protected Student clone() throws CloneNotSupportedException {
		//address is not cloned but refered
//		Student clonedStudent = (Student)super.clone();
//		// get the address object from the cloned student object
//		Address referencedAddress = clonedStudent.getAddress();
//		// clone the address object
//		Address newAddress = referencedAddress.clone();
//		// set the new address to the cloned student object
//		clonedStudent.setAddress(newAddress);
		
		// if not implementing Cloneable in Address class
		//address is not cloned but refered
		Student nclonedStudent = (Student)super.clone();
		// create a new address object
		Address newAdd = new Address();
		// set the values
		newAdd.setCity("Hassan");
		// set the new address to the cloned student object
		nclonedStudent.setAddress(newAdd);
		return nclonedStudent;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", address=" + address + "]";
	}

	
	
}
