package com.madpoints.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if beans are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object? " + result + "\n");
		
		System.out.println("Memory location for theCoach: " + theCoach + "\n");
		System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");
	
		// close context
		context.close();
	}

}
