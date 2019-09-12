package com.udemy.section8.autoboxing;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	private Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public static Branch createBranch(
			String name) {
		return new Branch(name);
	}

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	public Customer findCustomer(String name) {
		for (int i = 0; i < this.customers
				.size(); i++) {
			if (this.customers.get(i).getName()
					.equals(name)) {
				return this.customers.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Branch [name=" + name
				+ ", customers=" + customers
				+ "]";
	}

}
