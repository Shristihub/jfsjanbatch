package com.exceptions.basic;

public class MultiCatch {
	
	public static void main(String[] args) {
	try {
		System.out.println("welcome");
		String value ="100";
		System.out.println("value "+value);
		int num = Integer.parseInt(value);
		System.out.println("Number "+num);
		int result = 10/num;
		System.out.println("Result "+result);
		
		int[] marks= null;
		System.out.println(marks[0]);
		
	}catch(ArrayIndexOutOfBoundsException | NumberFormatException |ArithmeticException |NullPointerException e) {
		System.out.println("invalid input");
	}catch(RuntimeException e) {
		System.out.println("runtime");
	}
	   System.out.println("completed");
		
	}

}




