package com.shristi.overload;

public class Vehicle {

	String model;
	String brand;
	double price;
	public Vehicle() {
		super();
		System.out.println("no args");
	}
	public Vehicle(String model) {
		this();
		this.model = model;
		System.out.println("one args "+model);
	}
	public Vehicle(String model, String brand) {
		this(model);
		this.brand = brand;
		System.out.println("2 args"+model+" "+brand);
	}
	public Vehicle(String model, String brand, double price) {
		this(model,brand);
		this.price = price;
		System.out.println("3 args"+model+brand+price);
	}
	void getDetails() {
		if(model!=null)
		  System.out.println("Model "+model);
		if(brand!=null)
		  System.out.println("Brand "+brand);
		if(price>0)
		 System.out.println("Price "+price);
	}
	
	
	
	
}
