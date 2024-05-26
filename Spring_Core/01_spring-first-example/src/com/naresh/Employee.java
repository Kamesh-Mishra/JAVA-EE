package com.naresh;

public class Employee {

	
	
	int empId;
	String empName;
	double salary;
	
	public Employee() {
		System.out.println("Employee is created");
	}
	
	public void printEmp()
	{
		System.out.println("These Are Emp Details "+empId);
		System.out.println("These Are Emp Details "+empName);
		System.out.println("These Are Emp Details "+salary);
	}
}
