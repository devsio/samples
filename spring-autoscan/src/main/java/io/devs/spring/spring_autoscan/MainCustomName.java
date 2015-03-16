package io.devs.spring.spring_autoscan;

import io.devs.spring.spring_autoscan.services.ServiceZ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCustomName {

	// Demonstrates loading service by its Class name
	public static void main(String[] args) {
	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("spring-context.xml");
	      
	      ServiceZ service = (ServiceZ) context.getBean("theZService");

	      System.out.println(service.execute());
	      
	      ((AbstractApplicationContext)context).close();
	}

}
