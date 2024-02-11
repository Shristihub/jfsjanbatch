package com.api.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		Employee employe = new Employee("Tulsi", 10, "Bangalore");
		employeeList.add(employe);
		employeeList.add(new Employee("Priya", 2, "Bangalore"));
		employeeList.add(new Employee("Kevin", 5, "Pune"));
		employeeList.add(new Employee("Roni", 8, "Ooty"));
		employeeList.add(new Employee("Aarthi", 12, "Chennai"));

		Collections.sort(employeeList);
		
		Iterator<Employee> iterator = employeeList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee);
		}	
		System.out.println();

		// create a temporary array list employeesByCity
		List<Employee> employeesByCity = new ArrayList<>();
		
		for (Employee employee : employeeList) {
			  // check if an employee belongs to a particular city
			if (employee.getCity().equals("Bangalore"))
				// add the employee object to the temp list
				employeesByCity.add(employee);
		}
		System.out.println(employeesByCity);
	}
}
