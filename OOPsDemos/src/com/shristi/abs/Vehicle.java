package com.shristi.abs;

public abstract class Vehicle {
	abstract void getMileage();
	abstract void getAccessories(); 
	
	void showDetails() {
		System.out.println("in vehicle class");
	}
	
}
