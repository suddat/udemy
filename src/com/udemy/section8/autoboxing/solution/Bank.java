package com.udemy.section8.autoboxing.solution;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<Branch> branches;

	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}

	public ArrayList<Branch> getBranches() {
		return branches;
	}

	public boolean addBranch(String name) {
		if (findBranch(name) == null) {
			this.branches.add(new Branch(name));
			return true;
		}
		return false;
	}

	public void showBranches() {
		System.out.println("Branches of " + this.name + "");
		if (this.branches.size() > 0) {
			for (int i = 0; i < this.branches.size(); i++) {
				System.out.println((i + 1) + ". " + this.branches.get(i).getName());
			}
		}
	}

	public boolean addBranchCustomer(String branchName, String customerName, Double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.newCustomer(customerName, amount);
		}
		return false;
	}

	public boolean addCustomerMoney(String branchName, String customerName, Double amount) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			return branch.addCustomerTransaction(customerName, amount);
		}
		return false;
	}

	private Branch findBranch(String name) {
		for (int i = 0; i < this.branches.size(); i++) {
			Branch checkedBranch = this.branches.get(i);
			if (checkedBranch.getName().equals(name)) {
				return checkedBranch;
			}
		}
		return null;
	}

	public boolean listCustomers(String branchName, boolean showTransactions) {
		Branch branch = findBranch(branchName);
		if (branch != null) {
			System.out.println("Customer details for branch" + branch.getName());
			ArrayList<Customer> branchCustomers = branch.getCustomers();
			for (int i = 0; i < branchCustomers.size(); i++) {
				Customer branchCustomer = branchCustomers.get(i);
				System.out.println("\nCustomer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
				if (showTransactions) {
					System.out.println("Transactions");
					ArrayList<Double> transactions = branchCustomer.getAmount();
					for (int j = 0; j < transactions.size(); j++) {
						System.out.printf("\n [ %d ] Amount %f", j, transactions.get(j));
					}
				}
			}
			return true;
		} else {
			return false;
		}
	}

}
