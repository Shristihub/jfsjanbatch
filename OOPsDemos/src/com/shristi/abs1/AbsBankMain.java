package com.shristi.abs1;

public class AbsBankMain {

	public static void main(String[] args) {
		// superclass ref = subclass object
		Bank bank = new Branch1();
		bank.carLoan();
	    bank.eduLoan();
	    bank.housingLoan();
	    bank.admin();
	   
	    bank = new SubBranch();
	    // call all methods of bank
	    bank.carLoan(); // carloan from subbranch
	    bank.eduLoan();
	    bank.housingLoan();
	    
//	    Branch2  branch2 = new SubBranch();
	 // downcast and call
	    Branch2  branch2 = (Branch2)bank;
	    branch2.checkDeposit();
	    
//	    SubBranch sub = new SubBranch();
	    SubBranch sub = (SubBranch)bank;
	    sub.payInterest();
	    sub.checkDeposit();

	   
//	    Branch1 branch1 = new Branch1();
	    Branch1 branch1 = (Branch1)bank; // branch1 = new SubBranch()
	    branch1.payLoan();
	}
	
}





