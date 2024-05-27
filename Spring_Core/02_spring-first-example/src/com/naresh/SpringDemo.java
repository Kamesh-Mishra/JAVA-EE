package com.naresh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {

		// Creating Spring Conatiner Object + Provided XML file Details to Container
		BeanFactory container = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\06_jan_spring-first-example\\beans.xml");

		Object obj = container.getBean("s1");
		// Type casting
		Student student = (Student) obj;
		System.out.println("s1 Bean Object:  " + student);
		student.printStudentInformation();
		obj = container.getBean("empOne");

		// Type casting
		Employee employee = (Employee) obj;
		employee.printEmp();
		
		
		obj = container.getBean("s2");
		Student student2 = (Student) obj;
		System.out.println("Student s2 :  " + student2);
		
		

	}
}
