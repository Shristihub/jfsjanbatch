package com.inter.extend;

public interface Calculator {

	void add(int x, int y);
	void product(int x, int y);
	
	default void difference(int a, int b) {
		System.out.println(a-b);
	}
}
