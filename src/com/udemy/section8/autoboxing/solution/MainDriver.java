package com.udemy.section8.autoboxing.solution;

import java.util.Scanner;

public class MainDriver {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * System.out.println(myBank); Branch branch = Branch.createBranch(
		 * "Manyata Tech Park"); myBank.addBranch(branch); System.out.println(myBank);
		 */

		Bank myBank = new Bank("Yes Bank");

		myBank.addBranch("bangalore");

		myBank.addBranchCustomer("bangalore", "sud", 2540.32);
		myBank.addBranchCustomer("bangalore", "juju", 12540.32);
		myBank.addBranchCustomer("bangalore", "jadu", 20.0);

		myBank.addBranch("nagpur");
		myBank.addBranchCustomer("nagpur", "maa", 24020.0);

		myBank.addCustomerMoney("bangalore", "sud", 25.32);
		myBank.addCustomerMoney("bangalore", "juju", 40.32);
		myBank.addCustomerMoney("bangalore", "jadu", 2.0);

		myBank.listCustomers("bangalore", true);
		myBank.listCustomers("nagpur", true);

		if (!myBank.addBranchCustomer("pune", "gaurav", 5.53)) {
			System.out.println("\n\nError Pune does not exist");
		}

		if (!myBank.addBranch("nagpur")) {
			System.out.println("nagpur already exists");
		}

		if (!myBank.addCustomerMoney("bangalore", "maa", 100.0)) {
			System.out.println("maa is not in bangalore");
		}

		if (!myBank.addBranchCustomer("bangalore", "juju", 12351.65)) {
			System.out.println("Customer already exist");
		}
		/*
		 * boolean quit = false; printActions(); while (!quit) {
		 * System.out.println("Enter Your Choice: "); int choice = scanner.nextInt();
		 * switch (choice) { case 0: quit = true; System.out.println("Good Bye!!");
		 * break; case 1: addBankBranch(); break; case 2: showBankBranch(); break; case
		 * 3: addBankCustomer(); break; case 4: showBranchCustomer(); break; case 5:
		 * addCustomerMoney(); break; case 6: printActions(); break; default: break; } }
		 */
	}

	/*
	 * public static void addBankBranch() {
	 * System.out.println("Enter Branch Name to be added :"); String name =
	 * scanner.next(); System.out.println(name); myBank.addBranch(name); }
	 * 
	 * public static void showBankBranch() { myBank.showBranches(); }
	 * 
	 * public static void printActions() {
	 * System.out.println("Choose an option from below: ");
	 * System.out.println("0. Quit\n" + "1. Add Branch\n" + "2. Show Branch\n" +
	 * "3. Add Customer\n" + "4. Show Branch Customers\n" +
	 * "5. Deposite money for Customers\n" + "6. show different options\n"); }
	 * 
	 * public static void addBankCustomer() {
	 * System.out.println("Enter below branch Name where customer needs to be added"
	 * ); myBank.showBranches(); String branchName = scanner.next();
	 * System.out.println("Enter Customer Name : "); String customerName =
	 * scanner.next(); System.out.println("Enter Deposite Amount : "); double amount
	 * = scanner.nextDouble(); myBank.addBranchCustomer(branchName, customerName,
	 * amount); }
	 * 
	 * public static void showBranchCustomer() { // System.out.println(myBank);
	 * System.out.println("Choose Branch to view customer list");
	 * myBank.showBranches(); System.out.println("which Branch ?"); String
	 * branchName = scanner.next(); myBank.showBranchCustomer(branchName); }
	 * 
	 * public static void addCustomerMoney() { showBranchCustomer();
	 * System.out.println("Choose Customer Name : "); String customerName =
	 * scanner.next(); System.out.println("Enter amount to add : "); double amount =
	 * scanner.nextDouble(); myBank.addCustomerMoney(customerName, amount); }
	 */
}
