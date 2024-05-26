package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		// Creating Spring Conatiner Object + Provided XML file Details to Container
		BeanFactory container = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\05_jan_spring-first-example\\beans.xml");

		Object obj = container.getBean("s1");

		Student student = (Student) obj;

		student.printStudentInformation();
		
		
		obj = container.getBean("empOne");
		Employee employee = (Employee) obj;
		
		employee.printEmp();
		

	}
}
