package com.udemy.controlflow;

public class isEvenNumber {

	public static void main(String[] args) {
		System.out.println(isEven(2));
		System.out.println("SumDigits -->" + sumDigits(311));
		System.out.println(-1 / 10);
		System.out.println(sumFirstAndLastDigit(5));
	}

	public static boolean isEven(int no) {
		if (no % 2 == 0)
			return true;

		return false;
	}

	public static int sumDigits(int number) {
		if (number < 10)
			return -1;
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0)
			return -1;
		int temp = Math.abs(number);
		int sum = 0;
		sum = temp / 10;
		while (temp > 0) {
			temp = temp / 10;
		}
		sum += temp;
		return sum;
	}

}
