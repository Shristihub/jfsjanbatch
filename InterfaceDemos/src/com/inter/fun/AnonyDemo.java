package com.inter.fun;

public class AnonyDemo {

	public static void main(String[] args) {
		// class that implements this interface
		BonuCalculator bonuCalculator = new ManagerDetails();
		bonuCalculator.calcBonus();
		bonuCalculator.greet();
		
		// Using anonymous inner class
		// implementing the interface - and provide logic for the method
		BonuCalculator bcalc = new BonuCalculator() {
			@Override
			public void calcBonus() {
				System.out.println("Developer bonus");
			}

			@Override
			public void greet() {
				System.out.println("developer greet");
			}
		};
		// call the method of the anonymous class
		bcalc.calcBonus();
		bcalc.greet();
		
		BonuCalculator bcalc1 =  new BonuCalculator() {
			
			@Override
			public void calcBonus() {
				System.out.println("Tester bonus");
			}
			@Override
			public void greet() {
				System.out.println("tester greet");				
			}
		};
		bcalc1.calcBonus();
		bcalc1.greet();
		
	}
	
	
}
