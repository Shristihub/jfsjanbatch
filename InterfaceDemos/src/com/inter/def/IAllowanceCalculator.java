package com.inter.def;

public interface IAllowanceCalculator {

	void calculate();
	
	default void showPolicy() {
		System.out.println("policy for allowance");
	}
	static void call() {
		System.out.println("calling in IAllowance");
	}
	
}

