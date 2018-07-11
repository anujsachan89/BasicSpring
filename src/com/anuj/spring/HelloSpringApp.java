package com.anuj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
	
		// Retrieve bean from spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call methods of the bean
		System.out.println(theCoach.getDailyWorkout());
		
		
		//Close context
		context.close();
	}

}
