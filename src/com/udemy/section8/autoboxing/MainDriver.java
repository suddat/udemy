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
		scanner.nextLine();
		while (!quit) {
			System.out.println(
					"Enter Your Choice: ");
			scanner.nextLine();
			int choice = scanner.nextInt();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				addBankBranch();
				break;
			default:
				break;
			}
		}
	}
	
	public static void addBankBranch() {
		System.out.println("Enter Branch Name to be added :");
		String name = scanner.nextLine();
	}

}
