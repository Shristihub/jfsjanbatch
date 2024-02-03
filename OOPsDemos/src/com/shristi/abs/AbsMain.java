package com.shristi.abs;

public class AbsMain {

	public static void main(String[] args) {
		Vehicle vehicle = new Car(); //long x = 10;
		vehicle.getAccessories();
		vehicle.getMileage();
		vehicle.showDetails();
		
		Car car = (Car)vehicle; //  int y = x;
		car.check();
		
		vehicle = new  MiniVan();
		vehicle.getAccessories();
		vehicle.getMileage();
		vehicle.showDetails();
		
		
	}
}
