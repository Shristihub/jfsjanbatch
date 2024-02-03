package com.shristi.inheritance;

public class InherDemo {

	 public static void main(String[] args) {
		   InEmployee employee = new InEmployee("Sri",1);
     	    employee.print();
		   InManager manager = new InManager("Sripriya",10,9000);
		   manager.print();
//		   manager.calcBonus(5000);
		  }

}
