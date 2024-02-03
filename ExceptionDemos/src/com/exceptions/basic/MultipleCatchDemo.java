package com.exceptions.basic;

public class MultipleCatchDemo {
	
	public static void main(String[] args) {
	try {
		System.out.println("welcome");
		String value =args[0];
		System.out.println("value "+value);
		int num = Integer.parseInt(value);
		System.out.println("Number "+num);
		int result = 10/num;
		System.out.println("Result "+result);
		
		int[] marks= null;
		System.out.println(marks[0]);
		
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("array size is zero");
	}catch(NumberFormatException e) {
		System.out.println("do not enter a string");
	}catch(ArithmeticException e) {
		System.out.println("runtime exception");
	}catch(RuntimeException e) {
		System.out.println("runtime");
	}
	   System.out.println("completed");
		
	}

}




