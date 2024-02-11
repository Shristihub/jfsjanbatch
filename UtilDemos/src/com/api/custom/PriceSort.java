package com.api.custom;

import java.util.Comparator;

public class PriceSort implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		Double price1 = o1.getPrice();
		Double price2 = o2.getPrice();
		return price2.compareTo(price1);
	}

}
