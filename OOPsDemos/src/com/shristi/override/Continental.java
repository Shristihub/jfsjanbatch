package com.shristi.override;

public class Continental extends Food{

	@Override
	String[] showMenu() {
		String[] items = {"burgers","pastries"};
		return items;
	}
	

}
