/*
 * Author Nilanjan Dasgupta
 */
package com.ems.entity;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//clas employee
public class Employee {
	// instance variables
	private long empId;
	private String empName;
	private double empSal;
	Address address;// has A relationship
	//constructor
	public Employee(long empId, String empName, double empSal, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.address = address;
	}
	//getter method
	public long getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public Address getAddress() {
		return address;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	


}
