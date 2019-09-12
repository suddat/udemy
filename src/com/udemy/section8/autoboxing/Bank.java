package com.udemy.section8.autoboxing;

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

	/*
	 * public void addBranch(Branch branch) { this.branches.add(branch); }
	 */

	public void addBranch(String name) {
		int notPresent = checkBranch(name);
		if (notPresent < 0) {
			Branch branch = Branch.createBranch(
					name.toLowerCase());
			this.branches.add(branch);
		}
	}

	private int checkBranch(String name) {
		for (int i = 0; i < this.branches
				.size(); i++) {
			if (this.branches.get(i)
					.equals(name)) {
				System.out.println(
						"Branch Found at " + i
								+ " position");
				return i;
			}
		}
		return -1;
	}

	public void showBranches() {
		System.out.println(
				"Branches of " + this.name + "");
		if (this.branches.size() > 0) {
			for (int i = 0; i < this.branches
					.size(); i++) {
				System.out.println((i + 1) + ". "
						+ this.branches.get(i)
								.getName());
			}
		}
	}

	public void addBranchCustomer(
			String branchName,
			String customerName, Double amount) {
		int branchIndex = checkBranch(branchName);
		if (branchIndex >= 0) {
			Customer customer = Customer
					.createCustomer(customerName,
							amount);
			this.branches.get(branchIndex)
					.addCustomer(customer);
		}

	}

	@Override
	public String toString() {
		return "Bank [name=" + name
				+ ", branches=" + branches + "]";
	}

}
