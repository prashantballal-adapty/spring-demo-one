package com.prashant.springdemo;

public class TrackCoach implements Coach 
{
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout()
	{
		return "Track";
	}

	@Override
	public String getDailyFortune() {
		return "Yoooo" + fortuneService.getFortune();
	}
}
