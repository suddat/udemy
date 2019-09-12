package com.udemy.polymorphism;

/*class Hamburger {

	private String bread;
	private int meat;
	private int lettuce;
	private int tomato;
	private int carrot;
	private int cheese;

	public Hamburger() {
		this("bread", 1, 0, 0, 0, 0);
	}

	public Hamburger(String bread, int meat,
			int lettuce, int tomato, int carrot,
			int cheese) {
		this.bread = bread;
		this.meat = meat;
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.carrot = carrot;
		this.cheese = cheese;
	}

	public int getMeat() {
		return meat;
	}

	public void setMeat(int meat) {
		this.meat = meat;
	}

	public int getLettuce() {
		return lettuce;
	}

	public void setLettuce(int lettuce) {
		this.lettuce = lettuce;
	}

	public int getTomato() {
		return tomato;
	}

	public void setTomato(int tomato) {
		this.tomato = tomato;
	}

	public int getCarrot() {
		return carrot;
	}

	public void setCarrot(int carrot) {
		this.carrot = carrot;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	public double getPrice() {
		double price = 1 + (this.meat * 10)
				+ this.lettuce + this.tomato
				+ this.carrot + this.cheese;
		return price;
	}

	@Override
	public String toString() {
		return "Hamburger [bread=" + bread
				+ ", meat=" + meat + ", lettuce="
				+ lettuce + ", tomato=" + tomato
				+ ", carrot=" + carrot
				+ ", cheese=" + cheese + "]";
	}

}

class HealthyBurger extends Hamburger {

	private int cucumber;
	private int onions;

	public HealthyBurger(int meat, int lettuce,
			int tomato, int carrot, int cheese,
			int cucumber, int onions) {
		super("brown rye bread", meat, lettuce,
				tomato, carrot, cheese);
		this.cucumber = cucumber;
		this.onions = onions;
	}

	public int getCucumber() {
		return cucumber;
	}

	public void setCucumber(int cucumber) {
		this.cucumber = cucumber;
	}

	public int getOnions() {
		return onions;
	}

	public void setOnions(int onions) {
		this.onions = onions;
	}

	public double getPrice() {
		double parentPrice = super.getPrice();

		return parentPrice + this.cucumber
				+ this.onions;
	}

	@Override
	public String toString() {
		return "HealthyBurger [cucumber="
				+ cucumber + ", onions=" + onions
				+ "]" + super.toString();
	}

}*/
public class DriverHamBurger {

	public static void main(String[] args) {
		Hamburger hm = new Hamburger("Basic",
				"sausage", 3.46, "white");
		hm.itemSizeHamburger();

		hm.addHamBurgerAdd1("Tomato", 0.37);
		hm.addHamBurgerAdd2("Lettuce", 0.77);
		hm.addHamBurgerAdd3("Cheese", 1.12);

		System.out
				.println("Total Burger Price is:"
						+ hm.itemSizeHamburger());
		
		System.out.println("********************");
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.5);
		healthyBurger.addHealth1("egg", 2.5);
		healthyBurger.addHealth2("Lentils", 6.4);
		
		System.out.println("Total for Healthy Burger:"+healthyBurger.itemSizeHamburger());
		
		System.out.println("********************");
		
		DeluxeBurger db = new DeluxeBurger();
		db.addHamBurgerAdd1("dukar", 4.50);
		db.itemSizeHamburger();
		
	}

}
