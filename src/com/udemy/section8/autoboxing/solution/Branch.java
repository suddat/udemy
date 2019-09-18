package com.udemy.section8.autoboxing.solution;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<Customer> customers;

	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	public boolean newCustomer(String customerName, Double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		
		return false;
	}

	public boolean addCustomerTransaction(String customerName, Double amount) {
		Customer existingCustomer = findCustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.addAmount(amount);
			return true;
		}
		return false;
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	/*public static Branch createBranch(
			String name) {
		return new Branch(name);
	}*/

	public void addCustomer(Customer customer) {
		this.customers.add(customer);
	}

	private Customer findCustomer(String name) {
		for (int i = 0; i < this.customers
				.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if (checkedCustomer.getName()
					.equals(name)) {
				return checkedCustomer;
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
