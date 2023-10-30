package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		EmployeeDetails empDetails = new EmployeeDetails();
		List<Employee> list = new ArrayList<Employee>();
		list.add(empDetails);
		list.add(emp);

		Iterator<Employee> iterator = list.iterator();
		while (iterator.hasNext()) {
			Employee emp1 =iterator.next();
			System.out.println(emp1.getName());
			
		}

	}

}

class Employee {
	private String name = "Rohan";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class EmployeeDetails extends Employee {
	private String empAddress = "Bagde ";

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}