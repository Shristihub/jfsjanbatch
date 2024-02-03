package com.shristi.abs;

public class Car extends Vehicle{

	@Override
	void getMileage() {
		System.out.println("car mileage");
	}

	@Override
	void getAccessories() {
		System.out.println("car music system");
	}
	 void check() {
		 System.out.println("checking...");
	 }

}
