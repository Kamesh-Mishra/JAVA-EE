package com.flipkart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDIOfSetters {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\08_java_spring-di-examples\\spring-beans.xml");

		Product product = (Product) context.getBean("product1");
		
		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		
		
		product.setId(2);
		
		System.out.println(product.getId());
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		

	}

}
