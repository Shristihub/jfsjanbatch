package com.api.custom;

public class Mobile {

	private String brand;
	private String model;
	private double price;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String model, String brand, double price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
