package com.spring.annotaions.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotaionsDemo {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(BeansConfiguration.class);

		System.out.println("************************");
		
		// get Product1 Bean Object
		 Product product =  (Product) context.getBean("getProduct");
		 System.out.println(product);
		 
		 Product product2 =  (Product) context.getBean("product2");
		 System.out.println(product2);
		 
		Order order =  (Order) context.getBean("order1");
		System.out.println(order);
		System.out.println(order.getNoOfItems());
		System.out.println(order.getOrderId());
		System.out.println(order.getAmount());
		 
		
		 
		 Product product3 =  (Product) context.getBean("product3");
		 System.out.println(product3);
		 


	}

}
