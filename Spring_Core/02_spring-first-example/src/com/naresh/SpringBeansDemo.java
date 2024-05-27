package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBeansDemo {

	public static void main(String[] args) {

		// BeanFactory container = new FileSystemXmlApplicationContext();

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\06_jan_spring-first-example\\beans.xml");

		System.out.println("Getting Bean Object .......");
		Object obj = context.getBean("empOne");
		
		

	}

}
