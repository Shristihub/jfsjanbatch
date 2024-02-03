package com.shristi.abs1;

public class SubBranch extends Branch2{

	@Override
	void carLoan() {
		System.out.println("car loan in subbranch");
	}

	
//	@Override
//	void eduLoan() {
//		System.out.println("edu loan in subbranch");
//	}


	// own method of SubBranch
	void payInterest() {
		System.out.println("interest in sub");
	}
}




