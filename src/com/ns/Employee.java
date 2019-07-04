package com.ns;

import java.io.Serializable;

public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6261837473187279529L;
	private String empName;
	private int empId;
	 private int slalry;
    private static int age;
    private int number;
    
    
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getSlalry() {
		return slalry;
	}

	public void setSlalry(int slalry) {
		this.slalry = slalry;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Employee.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee{name " + this.empName + " ID " + this.empId + " salary " + this.slalry +" age " +Employee.age+ "}";
	}
}
