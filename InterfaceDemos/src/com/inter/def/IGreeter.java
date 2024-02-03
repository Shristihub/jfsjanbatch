package com.inter.def;

public interface IGreeter {
	
	// public static final by default
	double BONUS = 2000;
	
	// abstract method
	void sayHello(String username);
	
	// default method
	// can be overridden
	default void showMessage() {
		System.out.println("Welcome to Greeter");
	}
	
	//static method
	//cannot be overridden
	// can be called only using interface name
	static void print() {
		System.out.println("This is a static method");
	}
}
