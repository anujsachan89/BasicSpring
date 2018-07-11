package com.anuj.spring;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Batting Practise";
	}
}
