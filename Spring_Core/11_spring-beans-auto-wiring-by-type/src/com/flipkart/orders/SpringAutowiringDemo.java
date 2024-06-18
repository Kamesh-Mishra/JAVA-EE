package com.flipkart.orders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringAutowiringDemo {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\24_jan_spring-beans-auto-wiring-by-type\\beans.xml");
	

		Order order = (Order) context.getBean("order1");
		
		System.out.println(order.getProduct());
		System.out.println(order.getProduct().getId());
		
		
		System.out.println(order.getTransaction());
		
	}

}
