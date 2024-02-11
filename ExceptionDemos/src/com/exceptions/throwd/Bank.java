package com.exceptions.throwd;

public class Bank {
	void withdraw(int amount) throws Exception{
		System.out.println("inside bank");
		try {
			if(amount>1000) {
				throw new Exception("Amount should be greater than 1000");
			}
			System.out.println("Balance " + amount);
		} catch (Exception e) {
			System.out.println("exception...");
			throw e;
		} finally {
			System.out.println("close db");
		}
		System.out.println("Work done");
	}

}
