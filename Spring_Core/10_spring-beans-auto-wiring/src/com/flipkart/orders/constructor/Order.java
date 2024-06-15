package com.flipkart.orders.constructor;

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

	public Order(Product product, Product xyz, Transaction transaction) {
		super();
		this.product = product;
		this.xyz = xyz;
		this.transaction = transaction;
		System.out.println("order 3 arg, order(product, xyz, transaction) constructor is called!!");
	}

	
	public Order(Product xyz) {
		super();
		this.xyz = xyz;
		System.out.println("order 1 arg, order(xyz) constructor is called!!");
	}

//	public Order(Product product) {
//		super();
//		this.product = product;
//	}
	
	public Order(Transaction transaction) {
	super();
	this.transaction = transaction;
	System.out.println("order 1 arg, order(transaction) constructor is called!!");
	}
	

	
	public Order(Product product, Transaction transaction) {
	super();
	this.product = product;
	this.transaction = transaction;
	System.out.println("order 2 arg, order(product, transaction) constructor is called!!");
	}


//	public Order(Product xyz, Transaction transaction) {
//		super();
//		this.xyz = xyz;
//		this.transaction = transaction;
//	}
	
	
	// all arg constructor
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
