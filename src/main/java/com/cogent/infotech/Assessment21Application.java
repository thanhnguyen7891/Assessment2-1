package com.cogent.infotech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Assessment21Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Employee.class);
		Employee emp = context.getBean("employee", Employee.class);
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpSal());
	

	}

}
