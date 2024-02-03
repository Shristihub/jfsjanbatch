package com.shristi.inheritance;

public class FeaturePhone extends Mobile {

	String buttonType;

	public FeaturePhone(String brand, String model, double price, String buttonType) {
		super(brand, model, price);
		this.buttonType = buttonType;
	}
	
	void checkPhoneType() {
		// if buttontype is spongy, print premium phone
		// if type is hard print standard phone
		// else print local piece
	}

	// create main class as DemoMain
	// create SmartPhone obj and call getDetails and showApps("swiggy","whatsapp","insta)
	// create fetaurePhone obj and call getDetails and checkPhoneType
}
