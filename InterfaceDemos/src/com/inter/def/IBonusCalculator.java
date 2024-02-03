package com.inter.def;

public interface IBonusCalculator {

	void calculate();
	
	default void showPolicy() {
		System.out.println("policy for bonus");
	}
	static void call() {
		System.out.println("calling in IBonus");
	}
	
}

