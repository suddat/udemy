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
		boolean notPresent = checkBranch(name);
		if (notPresent) {
			Branch branch = Branch
					.createBranch(name);
			this.branches.add(branch);
		}
	}

	private boolean checkBranch(String name) {
		for (int i = 0; i < this.branches
				.size(); i++) {
			if (this.branches.get(i)
					.equals(name)) {
				System.out.println(
						"Branch Found at " + i
								+ " position");
				return false;
			}
		}
		return true;
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

	@Override
	public String toString() {
		return "Bank [name=" + name
				+ ", branches=" + branches + "]";
	}

}
