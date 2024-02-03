package com.inter.funinter;

import java.util.function.Supplier;

public class SupDemo {

	public static void main(String[] args) {
//		takes no input, performs logic
//		 returns an output of a type
		Supplier<String> sup = ()->{
			return "welcome";
		};
		System.out.println(sup.get());
		Supplier<Integer> sup1 = ()->100; // this returns 100
		System.out.println(sup1.get());
		
		
	}
}
