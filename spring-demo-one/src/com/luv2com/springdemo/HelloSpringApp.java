package com.luv2com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		BaseballCoach theCoach = context.getBean("myCoach",BaseballCoach.class);
		
		System.out.println(theCoach.getDailtWorkout());
		System.out.println(theCoach.getDailtFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
 