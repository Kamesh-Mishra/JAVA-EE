package com.flipkart;

import java.util.ArrayList;

public class Order {

	private String emailId;
	private float totalAmount;
	private boolean isOrderSuccess;
	private char foodType;
	private long mobileNumber;

	private ArrayList<String> foodItemNames;

	public Order() {
		System.out.println("Order is Created....");
	}

	public String getEmailId() {
		return emailId;
	}

	public ArrayList<String> getFoodItemNames() {
		return foodItemNames;
	}

	public void setFoodItemNames(ArrayList<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}

	public void setEmailId(String emailId) {
		System.out.println("set Email called......");
		this.emailId = emailId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		System.out.println("set Amount called......");
		this.totalAmount = totalAmount;
	}

	public boolean isOrderSuccess() {
		return isOrderSuccess;
	}

	public void setIsOrderSuccess(boolean isOrderSuccess) {
		System.out.println("set Order called......");
		this.isOrderSuccess = isOrderSuccess;
	}

	public char getFoodType() {
		return foodType;
	}

	public void setFoodType(char foodType) {
		System.out.println("set FoodType called......");
		this.foodType = foodType;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		System.out.println("set Mobile called......");
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Order [emailId=" + emailId + ", totalAmount=" + totalAmount + ", isOrderSuccess=" + isOrderSuccess
				+ ", foodType=" + foodType + ", mobileNumber=" + mobileNumber + ", foodItemNames=" + foodItemNames
				+ "]";
	}

}
