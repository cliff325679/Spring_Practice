package com.luv2com.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneservice;
	private String Email;
	private String team;
	
	public void setEmail(String Email) {
		System.out.println("setEmail");
		this.Email = Email;
	}

	public void setTeam(String team) {
		System.out.println("setTeam");
		this.team = team;
	}

	public BaseballCoach(FortuneService thefortuneservice) {
		fortuneservice = thefortuneservice;
	}

	public void setFortuneservice(FortuneService fortuneservice) {
		
		System.out.println("setFortuneservice");
		this.fortuneservice = fortuneservice;
	}

	public String getEmail() {
		return Email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailtWorkout() {
		return "Spend 30 min";
	}

	@Override
	public String getDailtFortune() {
		return fortuneservice.getFortune();
	}

}
