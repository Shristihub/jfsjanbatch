package com.shristi.overload;

public class VarArgsDemo {
	
	// int...marks -> this is var args 
	void sum(String name,int... marks) {
		System.out.println(name);
		System.out.println(marks.length);
		int total = 0;
		for (int m : marks) {
			total+=m;
		}
		System.out.println(total);
	}
	void sum(String uname) {
		System.out.println("Welcome "+uname);
	}

	public static void main(String[] args) {
		VarArgsDemo demo = new VarArgsDemo();
		demo.sum("Priya");
		demo.sum("Sri",90,8,60);
		demo.sum("Priya",90,80,80);
	}

}




