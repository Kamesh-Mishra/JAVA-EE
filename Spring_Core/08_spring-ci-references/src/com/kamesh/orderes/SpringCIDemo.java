package com.kamesh.orderes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringCIDemo {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\12_jan_spring-ci-references\\Spring-beans.xml");

		Order order = (Order) context.getBean("order");
		System.out.println(order);
		System.out.println("**************************");
		
		Order order1 = (Order) context.getBean("order1");
		System.out.println(order1);
		System.out.println(order1.getFoodItemNames());

		System.out.println("**************************");
		
		Order menu = (Order)context.getBean("menu");
		System.out.println(menu);
		

	}

}
