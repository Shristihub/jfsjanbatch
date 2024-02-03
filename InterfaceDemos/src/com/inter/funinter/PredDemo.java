package com.inter.funinter;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredDemo {

	public static void main(String[] args) {
//		takes an input of one type, tests a condition
//		 returns a boolean output
		Predicate<String> pred1 = username->{
			if(username.equals("Sri"))
				return true;
			return false;
		};
		System.out.println(pred1.test("Priya"));
		
		BiPredicate<String, Integer> pred2=(name,num)->{
			if(name.length()>num) return true;
			return false;
		};
		boolean result = pred2.test("Sri", 4);
		System.out.println(result);
	}
}
