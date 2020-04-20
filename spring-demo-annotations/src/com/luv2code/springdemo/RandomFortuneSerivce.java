package com.luv2code.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneSerivce implements FortuneService {

	private String[] data = {
			"AAA",
			"BBB",
			"CCC"
	};
	
	private Random r = new Random();
	
	@Override
	public String getFortune() {
		int index = r.nextInt(data.length);
		String temp = data[index];
		return temp;
	}

}
