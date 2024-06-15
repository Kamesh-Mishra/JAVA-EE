package com.flipkart.orders.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutowiringDemo {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\23_jan_spring-beans-auto-wiring\\beans_constructor.xml");
	
	
		Order order = (Order) context.getBean("order1");
		
//		System.out.println();
		
		
		System.out.println(order.getProduct());
		
		System.out.println(order.getXyz());
		
		System.out.println(order.getTransaction());
		System.out.println(order.getOrderID());
	
	}

}
