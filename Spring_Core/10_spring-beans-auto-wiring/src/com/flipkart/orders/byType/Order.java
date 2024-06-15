package com.flipkart.orders.byType;

public class Order {

	private String orderID;
	private Product product;
	private Product xyz;
	private Transaction transaction;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("order class default constructor called!! ");
	}

	public Order(String orderID, Product product, Product xyz, Transaction transaction) {
		super();
		this.orderID = orderID;
		this.product = product;
		this.xyz = xyz;
		this.transaction = transaction;
		
		System.out.println("order all arg constructor is called");
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		System.out.println("transaction Transaction is injected via seeter ");
		this.transaction = transaction;
	}

	public Product getXyz() {
		return xyz;
	}

	public void setXyz(Product xyz) {

		System.out.println("xyz Product is injected via setter ");
		this.xyz = xyz;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("Product is injected via setter");
		this.product = product;
	}

}
