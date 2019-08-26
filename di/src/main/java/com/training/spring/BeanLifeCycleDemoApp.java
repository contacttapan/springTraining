package com.training.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = (Coach) context.getBean("TTCoach", Coach.class);

		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}








