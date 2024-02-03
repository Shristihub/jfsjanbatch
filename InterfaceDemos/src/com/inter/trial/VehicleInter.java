package com.inter.trial;

public class VehicleInter {

	public static void main(String[] args) {
		Vehicle vehicle = new Car("Tata","Indica",123123,"India");
		vehicle.getMileage();
		vehicle.printDetails();
		
		// this is implemented by vehiclce
		// vehicle is smaller and Insurance is bigger
		Insurance insurance = vehicle;
		insurance.insuranceDetails();
		
		//Accessories and Vehicle are not related
		Accessories accessories = (Accessories)vehicle;
		accessories.interior();
		
		// call own method
		Car car = (Car)vehicle;
		car.checkPriceRange();
		System.out.println();
		
		vehicle = new Bike("Honda","XLR",2938344,"mountain");
		vehicle.printDetails();
		
		insurance = vehicle;
		insurance.insuranceDetails();
		
		Bike bike = (Bike)vehicle;
		bike.showCategory();
		
		
		
		
		
		
	}
}
