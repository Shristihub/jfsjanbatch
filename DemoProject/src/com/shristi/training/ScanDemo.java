package com.shristi.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		System.out.println("enter user details");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println(name);
		int id = scanner.nextInt();
		System.out.println(id);
		double sal = scanner.nextDouble();
		System.out.println(sal);
		scanner.close();
	}
}
