package com.prashant.springdemo;

public class BaseballCoach implements Coach
{
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "BaseBall";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
