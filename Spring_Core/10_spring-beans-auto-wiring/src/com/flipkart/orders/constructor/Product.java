package com.flipkart.orders.constructor;

public class Product {

	private int id;
	private double amount;
	private String name;

	public Product() {
		super();
		System.out.println("product default constructor is called");
		// TODO Auto-generated constructor stub
	}
	public Product(int id, double amount, String name) {
		super();
		this.id = id;
		this.amount = amount;
		this.name = name;
		
		System.out.println("product all arg constructor is called!!");
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
