package com.inter.def;

public class GreeterImpl implements IGreeter{

	@Override
	public void sayHello(String username) {
		System.out.println("Hello "+username);
	}
	

}
