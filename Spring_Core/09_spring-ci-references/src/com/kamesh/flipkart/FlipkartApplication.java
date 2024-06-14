package com.kamesh.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FlipkartApplication {

	public static void main(String[] ar) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\22_jan_spring-ci-references\\Spring-beans-ci-ref.xml");

		ProductDetails p1 = (ProductDetails) context.getBean("product1");
		System.out.println(p1);
		System.out.println(p1.getName());

		System.out.println("********************************");
		
		OrderDetails order1 = (OrderDetails) context.getBean("order1");
		System.out.println(order1);
		System.out.println(order1.getProductDetails());
		System.out.println(order1.getProductDetails().getName());

		System.out.println("********************************");
		
		OrderDetails order2 = (OrderDetails) context.getBean("order2");
		System.out.println(order2.getProductDetails());
		System.out.println(order2.getAmount());
		System.out.println(order2.getOrderId());
		System.out.println(order2.getProductDetails().getName());

	}
}
