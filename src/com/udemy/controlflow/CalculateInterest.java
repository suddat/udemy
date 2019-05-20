package com.udemy.controlflow;

public class CalculateInterest {

	public static void main(String[] args) {
		/*for (int i = 2; i < 9; i++) {
			System.out.println(String.format("%.2f", calculateInter(10000.0, i)));
		}
		System.out.println("-----------------");
		for (int i = 8; i > 1; i--) {
			System.out.println(String.format("%.2f", calculateInter(10000.0, i)));
		}*/
		
		//check prime numbers
		int cnt = 0;
		for(int i=10;i< 50;i++) {
			if(isPrime(i)) {
				System.out.println(i+" is prime no.");
				cnt++;
				if(cnt ==3)
					break;
			}			
		}
	}
	
	public static double calculateInter(double amount, double interestRate) {
		return (amount*(interestRate/100));
	}
	
	public static boolean isPrime(int n) {
		if(n == 1)
			return false;
		
		for(int i=2;i<=(long)Math.sqrt(n);i++) {
			if(n%i ==0)
				return false;
		}
		return true;					
	}

}
