package com.api.custom;

import java.util.Comparator;

public class ModelSort implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
		return o1.getModel().compareTo(o2.getBrand());
	}

}
