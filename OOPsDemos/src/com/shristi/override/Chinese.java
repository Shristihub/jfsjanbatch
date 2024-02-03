package com.shristi.override;

public class Chinese extends Food{

	@Override
	String[] showMenu() {
		String[] items = {"noodles","fried rice"};
		return items;
	}
	

}
