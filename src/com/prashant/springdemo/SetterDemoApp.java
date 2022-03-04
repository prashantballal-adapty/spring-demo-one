package com.prashant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach dCoach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(dCoach.getDailyWorkout());
		System.out.println(dCoach.getDailyFortune());
		System.out.println(dCoach.getEmail());
		System.out.println(dCoach.getTeam());
		context.close();
	}

}
