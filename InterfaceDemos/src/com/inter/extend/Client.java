package com.inter.extend;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new BasicCalculator();
		calc.add(10, 20);
		calc.product(10, 20);
		calc.difference(20, 10);
		
		Scientific sci = new ScientificCalculator();
		sci.cube(3);
		sci.square(20);
		sci.add(1, 20);
		sci.product(2, 1);
		sci.difference(20, 10);
	}
}
