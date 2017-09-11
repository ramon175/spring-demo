package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	
	public String[] fortunes = {"Today is your lucky day!","You are the best!",
			"Have faith!"};

	@Override
	public String getFortune() {
		Random random = new Random();
		int num = random.nextInt(3);
		return fortunes[num];
	}

}
