package com.shristi.override;

public class Italian extends Food{

	@Override
	String[] showMenu() {
		String[] items = {"pasta","pizza"};
		return items;
	}
	

}
