package com.inter.fun;

public class ManagerDetails implements BonuCalculator {

	@Override
	public void calcBonus() {
		System.out.println("Manager Bonus ");
	}

	@Override
	public void greet() {
		System.out.println("great manager");
	}

}
