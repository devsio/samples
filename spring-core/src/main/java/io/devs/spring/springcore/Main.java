package io.devs.spring.springcore;

import io.devs.spring.springcore.domain.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	      ApplicationContext context = 
	              new ClassPathXmlApplicationContext("spring-context.xml");
	      
	      Person person = (Person) context.getBean("homer");

	      System.out.println(person);
	      
	      ((AbstractApplicationContext)context).close();
	}

}
