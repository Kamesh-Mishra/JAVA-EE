package com.flipkart.orders.byName;

public class Transaction {

	private boolean isSuccess;
	private String meaasge;
	private int transactionId;

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
