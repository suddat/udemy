package com.udemy.inheritence;

public class Car extends Vehicle {
	/*
	 * private int airBags;
	 * 
	 * public Car(int seats, int typeOfGears, int wheels, int airBags) {
	 * super(seats, typeOfGears, wheels); this.airBags = airBags; }
	 * 
	 * public int getAirBags() { return airBags; }
	 * 
	 * public void setAirBags(int airBags) { this.airBags = airBags; }
	 */
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;

	private int currentGear;

	public Car(String name, String size,
			int wheels, int doors, int gears,
			boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println(
				"Car.setCurrentGear(): Changed to "
						+ this.currentGear
						+ " gear.");
	}

	public void changeVelocity(int speed,
			int direction) {
		System.out.println(
				"Car.changeVelocity(): Velocity "
						+ speed + " direction "
						+ direction);
		move(speed, direction);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

}
