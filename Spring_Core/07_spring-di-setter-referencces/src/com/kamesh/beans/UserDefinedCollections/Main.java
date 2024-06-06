package com.kamesh.beans.UserDefinedCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\11_jan_spring-di-setter-referencces\\Spring-Bean.xml");

		Employee employee1 = (Employee) context.getBean("employee1");

		Employee employee2 = (Employee) context.getBean("employee2");

		Company company = (Company) context.getBean("company");

		System.out.println(employee1);

		System.out.println(employee2);

		company.display();

	}

}
