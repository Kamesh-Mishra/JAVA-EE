package com.flipkart;

public class Product {

	//3 properties 
	private int id;
	private String productName;
	private double price;
	
	public Product() {
		System.out.println(" Product Is Created.....");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("set id is called");
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		System.out.println("set Name is called");
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
