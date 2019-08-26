package com.trainig.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

  public static void main(String[] args) {

    // load the spring configuration file
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

    // retrieve bean from spring container
    Coach trackCoach = (Coach) context.getBean("trackCoach");
    // retrieve bean from spring container
    Coach basketCoach = (Coach) context.getBean("baseballCoach");

    // call methods on the bean
    System.out.println("trackCoach: "+trackCoach.getDailyWorkout());
    System.out.println("basketBallCoach: "+basketCoach.getDailyWorkout());


    // close the context
    context.close();
  }

}







