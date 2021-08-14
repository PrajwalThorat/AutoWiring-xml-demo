package org.stackroute.AutoWiring_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emps=(Employee)context.getBean("emp");
		System.out.println(emps);
	}
}
