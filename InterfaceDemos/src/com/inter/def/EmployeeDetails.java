package com.inter.def;

public class EmployeeDetails implements IBonusCalculator,IAllowanceCalculator{

	@Override
	public void calculate() {
		System.out.println("Calculating bonus and allowance");
	}

	@Override
	public void showPolicy() {
		IBonusCalculator.super.showPolicy();
		IAllowanceCalculator.super.showPolicy();
		System.out.println("Policy for employee");
	}
	
	

}
