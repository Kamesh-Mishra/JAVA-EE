package com.flipkart.orders.byType;

public class Transaction {

	private boolean isSuccess;
	private String meaasge;
	private int transactionId;

	public Transaction() {
		super();
		System.out.println("transaction default superclass constructor is called");
	}

	public Transaction(boolean isSuccess, String meaasge, int transactionId) {
		super();
		this.isSuccess = isSuccess;
		this.meaasge = meaasge;
		this.transactionId = transactionId;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMeaasge() {
		return meaasge;
	}

	public void setMeaasge(String meaasge) {
		this.meaasge = meaasge;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

}
