package com.prashant.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach dCoach = context.getBean("MyCoach", Coach.class);
		System.out.println(dCoach.getDailyWorkout());
		System.out.println(dCoach.getDailyFortune());
		context.close();
	}

}
