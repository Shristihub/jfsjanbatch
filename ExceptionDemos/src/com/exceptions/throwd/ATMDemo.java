package com.exceptions.throwd;

public class ATMDemo {

	public static void main(String[] args) throws Exception{
		System.out.println("welcome");
		Bank bank = new Bank();
		bank.withdraw(8000);
		System.out.println("Amount withdrawn successfully");
		System.out.println("good bye");
		}
	}

