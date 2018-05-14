package com.madpoints.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class practiceActivityApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("practice-activity-three-context.xml");
		
		// retrieve bean from spring container
		Coach coachA = context.getBean("myLacrosseCoach", Coach.class);
		
		Coach coachB = context.getBean("myLacrosseCoach", Coach.class);
		
		// check if beans are the same
		boolean result = (coachA == coachB);
		
		System.out.println("\nPointing to the same object? " + result + "\n");
		
		System.out.println("Memory location for coachA: " + coachA + "\n");
		System.out.println("Memory location for coachB: " + coachB + "\n");
	
		// close context
		context.close();
	}

}
