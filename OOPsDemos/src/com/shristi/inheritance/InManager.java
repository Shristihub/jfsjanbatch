package com.shristi.inheritance;

public class InManager extends InEmployee{
   double salary;
  
public InManager(String name, int empId, double salary) {
	super(name, empId);
	this.salary = salary;
}





public void calcBonus(double amount) {
	   double sum = amount + salary;
	   System.out.println("Sum: "+ sum);
	  }
}

