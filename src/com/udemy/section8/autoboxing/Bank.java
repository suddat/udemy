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
			if (this.branches.get(i).getName()
					.equals(name)) {
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
		//System.out.println("branchIndex--->"+branchIndex);
		if (branchIndex >= 0) {
			Customer customer = Customer
					.createCustomer(customerName,
							amount);
			//System.out.println("customer : : "+customer);
			this.branches.get(branchIndex)
					.addCustomer(customer);
		}

	}
	
	public void showBranchCustomer(String branchName) {
		int branchIndex = checkBranch(branchName);
		System.out.println("Name\tAmount");
		for(int i=0;i < this.branches.get(branchIndex).getCustomers().size();i++ ) {
			System.out.println((i+1)+". "
			+this.branches.get(branchIndex).getCustomers().get(i).getName()+"\t"
			+this.branches.get(branchIndex).getCustomers().get(i).getAmount()
					);
		}
	}
	
	public void addCustomerMoney(String customerName, double amount) {
		
	}

	@Override
	public String toString() {
		return "Bank [name=" + name
				+ ", branches=" + branches + "]";
	}

}
