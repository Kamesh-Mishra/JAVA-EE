package com.kamesh.orderes;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Order {

	private int orderId;
	private String name;
	private boolean isOrderScussess;
	private Character foodType;
	private List<String> foodItemNames;
	private Map<String,Double> prices; 
	private Set<String> mealType;
	
	//all params constr
	public Order(int orderId, String name, boolean isOrderScussess, Character foodType, List<String> foodItemNames,
			Map<String, Double> prices, Set<String> mealType) {
		super();
		System.out.println("All param constructor called");
		this.orderId = orderId;
		this.name = name;
		this.isOrderScussess = isOrderScussess;
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
		this.prices = prices;
		this.mealType = mealType;
	}
	
	
	
	// 5 params 
		public Order(int orderId, String name, boolean isOrderScussess, Character foodType, List<String> foodItemNames) {
			super();
			System.out.println("5 Params Constructor called");
			this.orderId = orderId;
			this.name = name;
			this.isOrderScussess = isOrderScussess;
			this.foodType = foodType;
			this.foodItemNames = foodItemNames;
		}
		

	// 3 params 
	public Order(int orderId, String name, boolean isOrderScussess) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.isOrderScussess = isOrderScussess;
	}

	

	// 2 Params 
	public Order(Character foodType, List<String> foodItemNames) {
		super();
		this.foodType = foodType;
		this.foodItemNames = foodItemNames;
	}
	
	
	public Order(List<String> foodItemNames, Map<String, Double> prices) {	
		super();
		System.out.println("Prices and fooditemNames constructor called ");
		this.foodItemNames = foodItemNames;
		this.prices = prices;
	}
	

	public Map<String, Double> getPrices() {
		return prices;
	}

	public void setPrices(Map<String, Double> prices) {
		this.prices = prices;
	}
	
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isOrderScussess() {
		return isOrderScussess;
	}

	public void setOrderScussess(boolean isOrderScussess) {
		this.isOrderScussess = isOrderScussess;
	}

	public Character getFoodType() {
		return foodType;
	}

	public void setFoodType(Character foodType) {
		this.foodType = foodType;
	}

	public List<String> getFoodItemNames() {
		return foodItemNames;
	}

	public void setFoodItemNames(List<String> foodItemNames) {
		this.foodItemNames = foodItemNames;
	}
	

	public Set<String> getMealType() {
		return mealType;
	}

	public void setMealType(Set<String> mealType) {
		this.mealType = mealType;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", isOrderScussess=" + isOrderScussess + ", foodType="
				+ foodType + ", foodItemNames=" + foodItemNames + ", prices=" + prices + ", mealType=" + mealType + "]";
	}

}
