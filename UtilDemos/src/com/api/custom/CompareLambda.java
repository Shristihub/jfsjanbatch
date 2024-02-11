package com.api.custom;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareLambda {

	public static void main(String[] args) {
		List<Mobile> mobiles= Arrays.asList(
				new Mobile("S21", "Samsung", 90000),
				new Mobile("A52s", "Samsung", 132000),
				new Mobile("X100", "Oppo", 10000),
				new Mobile("A123", "Vivo", 12000),
				new Mobile("iPhone16", "Apple", 118000),
				new Mobile("X102", "Oppo", 18000)				
				);
		
		System.out.println("Using Lambda Expressions - By Brand");
		Comparator<Mobile> comp = (Mobile m1, Mobile m2)-> {
			int result = m1.getBrand().compareTo(m2.getBrand()) ;
			if(result == 0 ) {
				return ((Double)(m1.getPrice())).compareTo(m2.getPrice());
			}else
				return result;
		};
		Collections.sort(mobiles, comp);
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}	
		System.out.println();
		System.out.println("Using Lambda Expressions - By Model");
		Collections.sort(mobiles, (o1, o2)->{
			return o1.getModel().compareTo(o2.getModel());
		});
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		System.out.println();
		System.out.println("Using Lambda Expressions - By Price");
		Collections.sort(mobiles, (o1,o2)->{
			Double price1 = o1.getPrice();
			Double price2 = o2.getPrice();
			return price1.compareTo(price2);
		});
		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}
		
		
		
	}

}
