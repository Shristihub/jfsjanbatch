package com.shristi.abs1;

public abstract class Bank {
	abstract void carLoan();
	abstract void eduLoan();
	abstract void housingLoan();
	
	// concrete method
	void admin() {
		System.out.println("admin details");
		System.out.println("sub classes can see it,use it,can override");
	}
//	final method
	final void rules() {
		System.out.println("company rules");
		System.out.println("sub classes can see it,use it,cant override");
		policies();
	}

	private void policies() {
		System.out.println("confidential");
		System.out.println("visible only in this class");
	}
}
