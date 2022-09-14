/*
 * Author Nilanjan Dasgupta
 */
package com.ems.entity;

public class Address {
	//instance variable
	private String city;
	private String country;
	//constructor
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	//getter and setter method
	public String getCity() {
		return city;
	}
	public String getCountry() {
		return country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
