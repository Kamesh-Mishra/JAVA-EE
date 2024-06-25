package com.spring.annotaions.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

	// no Bean Id
	@Bean       
	public Product getProduct() {
		System.out.println("in getProduct method");
		Product product = new Product();
		return product;
	}

	@Bean("product2")
	public Product getProductTwo() {

		System.out.println("in getProductTwo method");
		Product product = new Product();
		return product;
	}

	@Bean("product3")
	public Product getProductThree() {
		System.out.println("in getProductThree method");
		Product p = new Product();
		
		return p;
	}

	@Bean("order1")
	public Order createOrder() {

		Order order = new Order();
		order.setAmount(222.00);
		order.setNoOfItems(2);
		order.setOrderId("order1234");

		return order;

	}

}
