package com.shristi.abs1;

public abstract class Branch2 extends Bank{

	@Override
	void eduLoan() {
		System.out.println("education loan in branch2");
	}

	@Override
	void housingLoan() {
		System.out.println("housing loan in branch2");
	}
     // own method of Branch2
	void checkDeposit() {
		System.out.println("pay loan in branch2");
	}
}


