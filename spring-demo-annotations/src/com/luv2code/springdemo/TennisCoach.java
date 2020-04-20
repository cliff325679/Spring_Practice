package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneSerivce")
	private FortuneService fortuneservice;
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("AAABBBCCC");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("111222333");
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService)
	{
		fortuneservice = theFortuneService;
	}
	*/
	
	/*
	@Autowired
	public void setFortuneservice(FortuneService theFortuneservice) 
	{
		fortuneservice = theFortuneservice;
	} 
	*/
	
	/*
	@Autowired
	public void doMyMethod(FortuneService theFortuneservice) 
	{
		fortuneservice = theFortuneservice;
	}
	*/
	
	@Override
	public String getDailyWorkout() 
	{
		return "Practice your backhand volley ";
	}

	@Override
	public String getDailyFortune() 
	{		
		return fortuneservice.getFortune();
	}

}
