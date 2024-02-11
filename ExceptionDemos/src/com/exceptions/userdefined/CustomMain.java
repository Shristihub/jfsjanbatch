package com.exceptions.userdefined;

public class CustomMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Custom Bank");
		CustomBank bank = new CustomBank(8000);
		try {
			bank.withdraw(3000);
		} catch (ExceedingLimitsException  e) {
			System.out.println("Exceeding the limits");
			System.out.println(e.getMessage());
		}catch (NegativeBalanceException e) {
			System.out.println("Your account balance becomes negative if withdrawn");
			System.out.println(e.getMessage());
		}
		System.out.println("Goodbye");
		
	}
}
