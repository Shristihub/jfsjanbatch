package com.inter.basics;

public class TrialOne implements Greetings {

	@Override
	public void sayHello(String username) {
		System.out.println(Greetings.message);
		System.out.println("Welcome "+username);

	}

	@Override
	public void check() {
		System.out.println("checking....");
	}

}
