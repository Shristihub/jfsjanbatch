package com.inter.funinter;

import java.util.function.Function;

public class FunDemo {

	public static void main(String[] args) {
//		 takes an input of one type , does some logic
//		returns an output of same type or another type
		Function<String, String> fun1 =  name->{
			return name.toUpperCase();
		};
		String result = fun1.apply("Sri");
		System.out.println(result);
		
		fun1 = name->name.toUpperCase();
		System.out.println(fun1.apply("Joe"));
		
		Function<String, Integer> fun2 = name->name.length();
		System.out.println(fun2.apply("Kathy"));
		
		
		
	}
}
