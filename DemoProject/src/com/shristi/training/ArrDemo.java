package com.shristi.training;

import java.util.Scanner;

public class ArrDemo {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int size =scanner.nextInt();
		String[] names = new String[size];
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next();
		}
		for(String username:names)
			System.out.println(username);
		
		scanner.close();
	}

}
