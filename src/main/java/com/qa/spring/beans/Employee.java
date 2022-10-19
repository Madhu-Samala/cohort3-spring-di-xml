package com.qa.spring.beans;

import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	/*
	 * private Address address;
	 * 
	 * public Employee(int id, String name, double salary, Address address) {
	 * System.out.println("Employee constructor invoked.."); this.id = id; this.name
	 * = name; this.salary = salary; this.address = address; }
	 */
	
	private List<Address> addressList;
	
	


	public Employee(int id, String name, double salary, List<Address> addressList) {
		System.out.println("Employee constructor invoked..");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.addressList = addressList;
	}

	
	public void init() {
		System.out.println("Init method of Employee Bean");
	}
	/*
	 * Will be called only for singleton instances
	 */
	public void destroy() {
		System.out.println("Destroy method of Employee Bean");
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", addressList=" + addressList + "]";
	}
	
	
	

}
