package com.shristi.overload;

public class Demo {
	Demo(){
		System.out.println("hello");
	}
	Demo(int x){
		this("Sri");
		System.out.println("Value "+10);
	}
	Demo(String x){
		this();
		System.out.println("Welcome "+x);
	}

	public static void main(String[] args) {
		Demo demo = new Demo(10);
	}
}
