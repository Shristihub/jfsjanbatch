package com.api.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {
		List<Mobile> mobiles= Arrays.asList(
				new Mobile("S21", "Samsung", 90000),
				new Mobile("A52s", "Samsung", 32000),
				new Mobile("X100", "Oppo", 10000),
				new Mobile("A123", "Vivo", 12000),
				new Mobile("iPhone16", "Apple", 118000),
				new Mobile("X102", "Oppo", 8000)				
				);
		
		System.out.println("Print all mobiles");
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println("Sort by brand");
		
		Comparator<Mobile> brandSort = new BrandSort();
		// 2nd param is object of class that implements Comparator
		Collections.sort(mobiles, brandSort);
		
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println("Sort by model");
		Collections.sort(mobiles,new ModelSort());
		
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println("Sort by price");
		Collections.sort(mobiles,new PriceSort());
		
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
	}
}












