package com.inter.basics;

public abstract class TrialTwo implements Greetings{

	@Override
	public void sayHello(String username) {
		System.out.println("Great Day "+username);
	}
	
	public void show(String... courses) {
		for (String course : courses) {
			System.out.println("Course "+course);
		}
	}

}
