package com.udemy.polymorphism;

/*
 * getDurationString(minutes, seconds) o/p = XXh YYm ZZs
 * getDurationString(seconds)
 * */
public class SecondsAndMinutes {
	private static final String INVALID_VALUE_MESSAGE = "Invalid value";

	public static void main(String[] args) {
		System.out.println(getDurationString(65,45));
		System.out.println(getDurationString(3945));
	}
	
	private static String getDurationString(int minutes, int seconds) {
		if(minutes < 0 || seconds <0 || seconds >59)
			return INVALID_VALUE_MESSAGE;
		int hour = minutes/60;
		minutes = minutes%60;		
		return hour+"h "+minutes+"m "+seconds+"s";
	}
	private static String getDurationString(int seconds) {
		if(seconds < 0)
			return INVALID_VALUE_MESSAGE;
		int minutes = seconds/60;
		seconds = seconds%60;		
		return getDurationString(minutes,seconds);
		
	}
}
