package com.inter.basics;

public class InterMain {

	public static void main(String[] args) {
		// interface ref =  new implementation class
		Greetings greetings = new TrialOne();
		greetings.sayHello("Priya");
		greetings.check();
		
		greetings = new SubTrial();
		greetings.sayHello("Sri");
		greetings.check();
		// call ownmethod of TrialTwo
		SubTrial trialTwo = (SubTrial)greetings;
		trialTwo.show("Java","angular","css");
		
		
		
	}
}
