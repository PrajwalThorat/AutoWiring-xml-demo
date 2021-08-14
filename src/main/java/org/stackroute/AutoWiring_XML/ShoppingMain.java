package org.stackroute.AutoWiring_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShoppingMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		//Getting bean for request1
		Shopping shop1=(Shopping)context.getBean("shop");
		
		//Getting bean for request2
		Shopping shop2=(Shopping)context.getBean("shop");
		
		System.out.println("Request_1 Address: "+shop1.hashCode());
		System.out.println("Request_2 Address: "+shop2.hashCode());
		System.out.println("Comparing two requests = "+(shop1==shop2));
	}
}
