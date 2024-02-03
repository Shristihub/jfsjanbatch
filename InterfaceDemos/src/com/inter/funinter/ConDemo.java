package com.inter.funinter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConDemo {

	public static void main(String[] args) {
//		takes an input of one type, does some logic, prints the result
//		 returns no output
		Consumer<String> con = (String username)->{
			System.out.println("Great Day " +username);
		};
		con.accept("Sri ");
		
		Consumer<Integer> con1 = n-> System.out.println(n*n);
		con1.accept(10);
	
		BiConsumer<String, Integer> bicon = (name,id)->{
			System.out.println("welcome "+name);
			System.out.println(id);
		};
		bicon.accept("sri", 10);
	}	
}
