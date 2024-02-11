package com.exceptions.userdefined;

public class CustomBank {
	double balance;

	public CustomBank(double balance) {
		super();
		this.balance = balance;
	}
	void withdraw(double amount) throws ExceedingLimitsException, NegativeBalanceException{
		System.out.println("inside bank");
	try {
		if(balance-amount<=0)
			throw new NegativeBalanceException("Balance is negative");
		if(amount>=2000)
			throw new ExceedingLimitsException("Amount should not be greater than 2000");
		balance-=amount;
		System.out.println(balance);
	}catch(ExceedingLimitsException e) {
		System.err.println("beyond limits...");
	}catch(NegativeBalanceException e) {
		System.err.println("negative balance...");
	}finally {
		System.out.println("close db");
	}
	System.out.println("completed ");
	}

}
