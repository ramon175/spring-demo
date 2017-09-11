package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		// load spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
			
		//retrieve bean from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//close the context
		context.close();  

	}

}
