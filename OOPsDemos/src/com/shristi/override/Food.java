package com.shristi.override;

public class Food {

	String[] showMenu() {
		String[] items = {"wrong choice"};
//		return items;
		return new String[] {"wrong choice"};
	}
}
