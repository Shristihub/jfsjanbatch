package com.shristi.override;

import java.util.Scanner;

public class Restaurant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		Food food = null;
		if(choice.equals("ch")) {
		  food = new Chinese();
		}
		else if(choice.equals("i")) {
			  food = new Italian();
		}
		else if(choice.equals("c")) {
			  food = new Continental();
		}else
			food  = new Food();
		String[] items = food.showMenu();
		for (String item : items) {
			System.out.println(item);
		}
		
	}
}
