package com.udemy.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {		
		System.out.println(calcFeetAndInchesToCentimeters(25));		
	}
	public static double calcFeetAndInchesToCentimeters(int feet, double inches) {
		if(feet < 0 || (inches < 0.0 || inches > 12.0))
			return -1;
		
		double cent = (feet*12 + inches)*2.54; 
		return cent;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {		
		if(inches < 0)
			return -1;		
		return calcFeetAndInchesToCentimeters((int)inches/12, inches%12);
	}
}
