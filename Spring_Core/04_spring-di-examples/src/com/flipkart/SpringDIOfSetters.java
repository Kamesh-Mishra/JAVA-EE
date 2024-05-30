package com.flipkart;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfSetters {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\09_jan_spring-di-examples\\spring-beans.xml");

		Product product = (Product) context.getBean("product1");

		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());

		System.out.println("Product 2 Details ......................");
		Product p2 = (Product) context.getBean("product2");

		System.out.println(p2.getId());
		System.out.println(p2.getProductName());
		System.out.println(p2.getPrice());

		p2.setId(8888);

		System.out.println(p2.getId());
		System.out.println(p2.getProductName());
		System.out.println(p2.getPrice());

		System.out.println("***************   Order Data *************");
		Order order1 = (Order) context.getBean("order1");

		System.out.println(order1);
		
		List<String>  itemNames = order1.getFoodItemNames();

		// Stream API 
		for(String item : itemNames) {
			System.out.println(item);
		}
		

	}
}
