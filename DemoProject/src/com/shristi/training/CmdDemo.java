package com.shristi.training;

public class CmdDemo {

	public static void main(String[] args) {
		
		// priya 100 2000.6 
		String name = args[0];
		System.out.println(name);//priya
		String empId = args[1]; // "100"
		System.out.println(empId+200); //"100"+200 = 100200
		//method from Integer
		 int id = Integer.parseInt(empId); //if you pass string // NUmberFormatException
		System.out.println(id+200); //100+200 =300
		double sal = Double.parseDouble(args[2]);
		System.out.println(sal);
		}
}
//java cmdDemo throws Exception

//java cmdDemo priya 100 2000.8 - proper output

//java cmdDemo sri priya 100 1000







