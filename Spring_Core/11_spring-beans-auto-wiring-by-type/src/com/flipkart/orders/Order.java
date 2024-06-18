package com.flipkart.orders;

public class Order {

	private String orderID;
	private Product product;
	private Transaction transaction;
	
	public Order() {
		System.out.println("Order Instantiated");
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		System.out.println("Transaction is injected via setter");
		this.transaction = transaction;
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
