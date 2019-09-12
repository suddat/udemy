package com.udemy.section8.autoboxing;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> amount;

	private Customer(String name, Double amount) {
		this.name = name;
		this.amount = new ArrayList<>();
		this.amount.add(amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getAmount() {
		return amount;
	}

	public void addAmount(Double amount) {
		this.amount.add(amount);
	}

	public static Customer createCustomer(
			String name, Double amount) {
		return new Customer(name, amount);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name
				+ ", amount=" + amount + "]";
	}

}
