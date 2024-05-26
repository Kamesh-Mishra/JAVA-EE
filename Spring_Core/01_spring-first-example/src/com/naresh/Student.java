package com.naresh;

public class Student {

	int id;
	String name;

	public Student() {
		System.out.println("Student is Created.. ");
	}

	public void printStudentInformation() {
		System.out.println("Name is : " + name);
		System.out.println("ID is : " + id);
	}
}
