package com.madpoints.springdemo;

public class TrackCoach implements Coach {

	// define private field for dependency
		private FortuneService fortuneService;
		
	// define constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	// no arg constructor
	public TrackCoach() {
		super();
	}
	
	@Override
	public String getDailyWorkout() {	
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStarterStuff() {
		System.out.println("TrackCoach: inside method doMyStarterStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside method doMyCleanupStuff");
	}

}
