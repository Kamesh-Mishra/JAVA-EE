package com.flipkart.set.values;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDISetterInjectionDemo {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"E:\\Work_Practicals\\Spring\\10_jan_spring-di-examples\\spring-beans-two.xml");

		Student student = (Student) context.getBean("student1");
		System.out.println(student);
		//		System.out.println(student.getSubjects());
//
//		System.out.println(student.getSubMarks());

		
		System.out.println("Student 2 Data ");
		
		
		student = (Student) context.getBean("student2");
		System.out.println(student);
		//		System.out.println(student.getSubjects());
//
//		System.out.println(student.getSubMarks());
	}

}
