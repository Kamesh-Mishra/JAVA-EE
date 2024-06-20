package com.spring.bean.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringBEanScopesDemo {

	public static void main(String[] args) {

		ApplicationContext container = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\25_jan_spring-beans-scopes\\beans.xml");

		// 1st time request to container for e1
		Employee emp1 = (Employee) container.getBean("e1");
		System.out.println(emp1);

		emp1.setName("Dilip");

		// 2nd time request to container for e1
		Employee emp2 = (Employee) container.getBean("e1");
		System.out.println(emp2);

		System.out.println(emp2.getName());

		System.out.println("****************   E2 Bean Object **************");

		// 1st time request to container for e2
		Employee emp3 = (Employee) container.getBean("e2");
		System.out.println(emp3);
		
		emp3.setName("Dilip");
		

		// 2nd time request to container for e2
		Employee emp4 = (Employee) container.getBean("e2");
		System.out.println(emp4);
		System.out.println(emp3.getName());
		
		System.out.println(emp4.getName());

		// 3rd time request to container for e2
		Employee emp5 = (Employee) container.getBean("e2");
		System.out.println(emp5);
		System.out.println(emp5.getName());
	}

}
