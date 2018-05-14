package com.madpoints.springdemo;

public class BaseballCoach implements Coach {
	
	// define private field for dependency
	private FortuneService fortuneService;
	
	// define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// no arg constructor
	public BaseballCoach() {
		super();
	}
	
	@Override
	public String getDailyWorkout() {
		return "30 minutes batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
