package com.shristi.abs1;

public final class Branch1 extends Bank{
	
	final double INTERESTAMOUNT = 2000; // constant

	@Override
	void carLoan() {
		System.out.println("car loan in branch1");
	}

	@Override
	void eduLoan() {
		System.out.println("education loan in branch1");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch1");
	}
     // own method of Branch1
	void payLoan() {
		System.out.println("pay loan in branch1");
	}
	
}






