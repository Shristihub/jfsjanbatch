package com.shristi.overload;

public class VehicleMain {

	static public  void main(String[] args) {
		Vehicle  vehicle = new Vehicle();
		vehicle.getDetails();
		System.out.println();
		Vehicle  vehicle1 = new Vehicle("Civic");
		vehicle1.getDetails();
		System.out.println();
		Vehicle  vehicle2 = new Vehicle("City","Honda");
		vehicle2.getDetails();
		System.out.println();
		Vehicle  vehicle3 = new Vehicle("Safari","Tata",12381293);
		vehicle3.getDetails();
		
	}
	

}
