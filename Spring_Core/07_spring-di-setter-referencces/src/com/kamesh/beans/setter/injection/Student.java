package com.kamesh.beans.setter.injection;

import java.util.List;

public class Student {

	private int id;
	
	private String name;
	private List<Long> mobileNumbers;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobileNumbers(List<Long> mobileNumbers) {
		this.mobileNumbers = mobileNumbers;
	}

	public List<Long> getMobileNumbers() {
		return mobileNumbers;
	}



	public Student() {
		System.out.println("Student is Created");
	}

}
