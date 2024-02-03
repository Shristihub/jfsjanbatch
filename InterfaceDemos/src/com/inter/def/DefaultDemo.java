package com.inter.def;

public class DefaultDemo {

	public static void main(String[] args) {
		
		IBonusCalculator iBonus = new EmployeeDetails();
		iBonus.calculate();
		iBonus.showPolicy();
		
		IBonusCalculator.call();
		
//		IAllowanceCalculator iAllowance = new EmployeeDetails();
		
		IAllowanceCalculator iAllowance = (IAllowanceCalculator)iBonus;
		iAllowance.calculate();
		iAllowance.showPolicy();
		IAllowanceCalculator.call();
		
	}
}
