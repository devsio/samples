package io.devs.spring.spring_autoscan;

import io.devs.spring.spring_autoscan.services.ServiceX;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	// Demonstrates loading service by its Class name
	public static void main(String[] args) {
	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("spring-context.xml");
	      
	      ServiceX service = (ServiceX) context.getBean("serviceX");

	      System.out.println(service.execute());
	      
	      ((AbstractApplicationContext)context).close();
	}

}
