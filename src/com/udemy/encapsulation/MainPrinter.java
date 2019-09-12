package com.udemy.encapsulation;

public class MainPrinter {

	public static void main(String[] args) {
		Printer printer = new Printer(50, false);

		System.out.println("initial page count ="
				+ printer.getPages());

		int pages = printer.printPages(4);

		System.out.println("pages printed are : "
				+ pages
				+ " new total print pages = "
				+ printer.getPages());

		pages = printer.printPages(2);

		System.out.println("pages printed are : "
				+ pages
				+ " new total print pages = "
				+ printer.getPages());
	}

}
