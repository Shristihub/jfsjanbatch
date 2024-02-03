package com.inter.trial;

public class Car extends Vehicle implements Accessories{
	String make;

	public Car(String brand, String model, double price, String make) {
		super(brand, model, price);
		this.make = make;
	}

	@Override
	public void insuranceDetails() {
		System.out.println("Car insurance");
	}

	@Override
	void getMileage() {
		System.out.println("Car mileage");
		
	}

	@Override
	public void interior() {
		System.out.println("music system, dash camera");
	}
	
	// own method
	public void checkPriceRange() {
	  if(make.equals("india"))
		System.out.println("model available in diff prize range");
	  else
	   System.out.println("High end models");
	}

}
