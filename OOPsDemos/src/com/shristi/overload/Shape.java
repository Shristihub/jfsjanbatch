package com.shristi.overload;

public class Shape {
	void area(int x) {
		System.out.println("SQ "+(x*x));
	}
	int area(int x, int y) {
		return x*y;
	}
	void area(double x) {
		System.out.println("Circle "+(Math.PI*x*x));
	}
//	double area(int x, float y) {
//		return 0.5*x*y;
//	}

}
