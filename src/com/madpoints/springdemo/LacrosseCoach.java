package com.madpoints.springdemo;

public class LacrosseCoach implements Coach {

	// define private field for dependency
	private FortuneService fortuneService;
		
//	// define constructor for dependency injection
//	public LacrosseCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	// no arg constructor	
	public LacrosseCoach() {
		super();
		System.out.println("LacrosseCoach: inside no-arg contructor");
	}
	
	// setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("LacrosseCoach: inside setter - setFortuneServices");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {	
		return "Run fast break drill for 15 minutes";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}
}
