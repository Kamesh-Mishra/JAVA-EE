package com.kamesh.beans.constructor.injection;

// Constructor Injection 

public class Employee {

	private int id;
	private String name;
	private double salary;

	// 3 params
	public Employee(int id, String name, double salary) {
		super();
		System.out.println("Employee : 3 Params Constructor is executed.");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Employee  : setId : method");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Employee  : setName : method");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Employee  : setSalary : method");
		this.salary = salary;
	}

}
