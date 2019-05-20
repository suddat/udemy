package com.udemy.IO;

import java.util.Scanner;

public class Scann {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Year of Birth :");

		boolean hasNextInt = sc.hasNextInt();

		if (hasNextInt) {
			int yearOfBirth = sc.nextInt();
			sc.nextLine();

			System.out.println("Enter your name : ");
			String name = sc.nextLine();

			int age = 2019 - yearOfBirth;
			if (age >= 0 && age <= 100) {
				System.out.print("Your Name is " + name);
				System.out.println(", and you are " + age + " Old");
			} else {
				System.out.println("Invalid year of birth");
			}
		} else {
			System.out.println("Unable to parse year of birth");
		}

		sc.close();
	}
}
