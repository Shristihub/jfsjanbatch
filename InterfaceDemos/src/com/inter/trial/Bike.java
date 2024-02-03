package com.inter.trial;

public class Bike extends Vehicle {
	String type;
	public Bike(String brand, String model, double price, String type) {
		super(brand, model, price);
		this.type = type;
	}

	@Override
	public void insuranceDetails() {
		System.out.println("bike insurance");
	}

	@Override
	void getMileage() {
		System.out.println("Bike mileage");

	}
	void showCategory() {
		if(type.equals("mountain")) {
			System.out.println("Terrain bikes");
		}else
			System.out.println("road bikes");
	}

}
