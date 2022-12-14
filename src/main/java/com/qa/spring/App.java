package com.qa.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qa.spring.beans.Address;
import com.qa.spring.beans.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("------");
		Employee emp1 = context.getBean("emp1", Employee.class);
		System.out.println(emp1.hashCode());

		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp2.hashCode());
		
		System.out.println(emp1 == emp2);
		
		

		/*
		 * Address homeAddress = context.getBean("homeaddress", Address.class);
		 * System.out.println(homeAddress); Address officeAddress =
		 * context.getBean("officeaddress", Address.class);
		 * System.out.println(officeAddress);
		 */
		
		((ConfigurableApplicationContext)context).close();
	}
}
