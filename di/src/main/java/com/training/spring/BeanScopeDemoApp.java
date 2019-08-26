package com.training.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = (Coach) context.getBean("myCoach");

		Coach alphaCoach = (Coach) context.getBean("myCoach");
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);


		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);

		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

		TrackCoach alpha=(TrackCoach)alphaCoach;
		TrackCoach coach=(TrackCoach)theCoach;
		// check if they are the same
		boolean resultOfService = (alpha.getFortuneService() == coach.getFortuneService());



		// print out the results
		System.out.println("\nFortuneService ..Pointing to the same object: " + resultOfService);


		// close the context
		context.close();
	}

}








