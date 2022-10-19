package com.qa.spring.beans;

public class Address {
	
	private String houseNo;
	private String street;
	private int zipCode;
	
	public Address() {
		System.out.println("Address constructor invoked..");
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", street=" + street + ", zipCode=" + zipCode + "]";
	}
	
	

}
