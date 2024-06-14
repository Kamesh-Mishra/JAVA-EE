package com.kamesh.flipkart;

public class OrderDetails {

	private String orderId;
	private double amount;
	private ProductDetails productDetails;

	
	public OrderDetails() {
		
	}
	public OrderDetails(String orderId, double amount, ProductDetails productDetails) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.productDetails = productDetails;
	}

	public OrderDetails(ProductDetails productDetails) {
		super();
		this.productDetails = productDetails;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public ProductDetails getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetails productDetails) {
		this.productDetails = productDetails;
	}

}
