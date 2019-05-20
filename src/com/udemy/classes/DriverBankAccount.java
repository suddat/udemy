package com.udemy.classes;

public class DriverBankAccount {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		/*acc.setAccountNumber("10032791");
		acc.depositeFund(50.00);
		acc.withdrawFund(100.0);

		acc.setCustomerName("Riz");
		acc.setEmail("riz.rana@gm.com");

		acc.setPhoneNumber("7406493312");
		acc.setBalance(200.0);

		acc.depositeFund(51.0);
		acc.withdrawFund(100.0);*/

		System.out.println(acc);

		BankAccount apporvAcc = new BankAccount(
				"10024569", 400.0,
				"Apoorv Agarwal",
				"app@agarwal.com", "7406493321");
		
		System.out.println(apporvAcc);
	}

}
