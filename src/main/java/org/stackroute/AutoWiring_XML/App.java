package org.stackroute.AutoWiring_XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    	Application app=(Application)context.getBean("application");
    	
    	System.out.println(app);
    }
}
