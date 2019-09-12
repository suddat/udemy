package com.udemy.polymorphism;

public class DeluxeBurger extends Hamburger {
	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 14.56, "white");
		super.addHamBurgerAdd1("Chips", 2.75);
		super.addHamBurgerAdd2("Lentils", 5.12);
	}

	@Override
	public void addHamBurgerAdd1(String name,
			double price) {
		System.out.println("Cannot Additional items to a deluxe burger");
	}

	@Override
	public void addHamBurgerAdd2(String name,
			double price) {
		System.out.println("Cannot Additional items to a deluxe burger");
	}

	@Override
	public void addHamBurgerAdd3(String name,
			double price) {
		System.out.println("Cannot Additional items to a deluxe burger");
	}

	@Override
	public void addHamBurgerAdd4(String name,
			double price) {
		System.out.println("Cannot Additional items to a deluxe burger");
	}
	
	
}
