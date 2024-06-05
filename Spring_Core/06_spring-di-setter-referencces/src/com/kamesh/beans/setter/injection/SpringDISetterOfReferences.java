package com.kamesh.beans.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDISetterOfReferences {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext("E:\\Work_Practicals\\Spring\\06_spring-di-setter-referencces\\spring-beans.xml");

		
		
		Student stu = (Student) context.getBean("student1");
		System.out.println(stu);
		System.out.println(stu.getName());

		System.out.println("*****************************************");
		
		College clg = (College) context.getBean("college");
		System.out.println(clg);

		Student student = clg.getStudent();
		System.out.println(student.getName());

		System.out.println(clg.getStudent().getName());

	}

}
