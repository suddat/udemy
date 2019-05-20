package com.udemy.classes;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;

	// constructor

	public BankAccount() {
		this("1235446", 10.0, "Default name",
				"Default address",
				"default phone");
		System.out.println(
				"Empty constructor called");
	}

	// parameterised constructor

	public BankAccount(String accountNumber,
			double balance, String customerName,
			String email, String phoneNumber) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	// getter and setters for class fields.

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(
			String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(
			String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(
			String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// create deposite method
	public void depositeFund(double addFund) {
		this.balance += addFund;
	}

	// create withdraw method
	public void withdrawFund(
			double withdrawAmount) {
		if (this.balance - withdrawAmount < 0) {
			System.out.println("Only "
					+ this.balance
					+ " available. withdrawl not processed");
		} else {
			this.balance -= withdrawAmount;
			System.out.println("Withdrawl of "
					+ withdrawAmount
					+ " processed. Remaining balance = "
					+ this.balance);
		}
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber="
				+ accountNumber + ", balance="
				+ balance + ", customerName="
				+ customerName + ", email="
				+ email + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
