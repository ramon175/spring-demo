package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	//add new fields for email address and team
	private String email;
	private String team;
	//
	

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}
	
	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}
		
	//	


	@Override
	public String getDailyWorkout() {
		
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
