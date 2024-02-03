package com.inter.def;

public class DefMain {

	public static void main(String[] args) {

		IGreeter greeter = new GreeterImpl();
		greeter.sayHello("Sri");
		greeter.showMessage();
		System.out.println(greeter.BONUS);
		
		// call static method using interface name
		IGreeter.print();
		System.out.println(IGreeter.BONUS);
		
	}

}
