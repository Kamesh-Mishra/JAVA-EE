package com.flipkart.orders.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutowiringDemo {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\23_jan_spring-beans-auto-wiring\\beans_byType.xml");
	
	
		Order order = (Order) context.getBean("order1");
		
		System.out.println(order.getProduct());
		
		System.out.println(order.getXyz());
		
		System.out.println(order.getTransaction());
	
	}

}
