package com.prashant.springdemo;

public class CricketCoach implements Coach {

private FortuneService fortuneService;
	
	private String email;
	private String team;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Cricket email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Cricket team");
		this.team = team;
	}

	public CricketCoach()
	{
		System.out.println("Cricket Constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket setter");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
