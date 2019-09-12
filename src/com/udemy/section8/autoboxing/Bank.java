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

	public void addBranch(Branch branch) {
		this.branches.add(branch);
	}

	@Override
	public String toString() {
		return "Bank [name=" + name
				+ ", branches=" + branches + "]";
	}

}
