package com.inter.trial;

public abstract class Vehicle implements Insurance{
	String brand;
	String model;
	double price;
	public Vehicle(String brand, String model, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	void printDetails() {
		System.out.println(brand+"\t"+model+"\t"+price);
	}
	abstract void getMileage();
	

}
