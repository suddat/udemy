package com.udemy.section8.autoboxing;

import java.util.Scanner;

public class MainDriver {

	private static Scanner scanner = new Scanner(
			System.in);
	private static Bank myBank = new Bank(
			"Yes Bank");

	public static void main(String[] args) {
		/*
		 * System.out.println(myBank); Branch branch = Branch.createBranch(
		 * "Manyata Tech Park"); myBank.addBranch(branch); System.out.println(myBank);
		 */
		boolean quit = false;
		// scanner.nextLine();
		printActions();
		while (!quit) {
			System.out.println(
					"Enter Your Choice: ");
			// scanner.nextLine();
			int choice = scanner.nextInt();
			switch (choice) {
			case 0:
				quit = true;
				System.out.println("Good Bye!!");
				break;
			case 1:
				addBankBranch();
				break;
			case 2:
				showBankBranch();
				break;

			case 6:
				printActions();
				break;
			default:
				break;
			}
		}
	}

	public static void addBankBranch() {
		System.out.println(
				"Enter Branch Name to be added :");
		String name = scanner.next();
		System.out.println(name);
		myBank.addBranch(name);
	}

	public static void showBankBranch() {
		myBank.showBranches();
	}

	public static void printActions() {
		System.out.println(
				"Choose an option from below: ");
		System.out.println("0. Quit\n"
				+ "1. Add Branch\n"
				+ "2. Show Branch\n"
				+ "6. show different options\n");
	}

}
