package com.udemy.inheritence;

public class Vehicle {
	/*
	 * private int seats; private int typeOfGears; private int wheels;
	 * 
	 * public Vehicle(int seats, int typeOfGears, int wheels) { super(); this.seats
	 * = seats; this.typeOfGears = typeOfGears; this.wheels = wheels; }
	 * 
	 * public int getSeats() { return seats; }
	 * 
	 * public void setSeats(int seats) { this.seats = seats; }
	 * 
	 * public int getTypeOfGears() { return typeOfGears; }
	 * 
	 * public void setTypeOfGears(int typeOfGears) { this.typeOfGears = typeOfGears;
	 * }
	 * 
	 * public int getWheels() { return wheels; }
	 * 
	 * public void setWheels(int wheels) { this.wheels = wheels; }
	 */
	private String name;
	private String size;

	private int currentVelocity;
	private int currentDirection;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.currentVelocity = 0;
		this.currentDirection = 0;
	}

	public void steer(int direction) {
		this.currentDirection = direction;
		System.out.println(
				"vehicle.steer(): steering at "
						+ currentDirection
						+ " degrees");
	}

	public void move(int velocity,
			int direction) {
		this.currentDirection = direction;
		this.currentVelocity = velocity;
		System.out.println(
				"\n\nvehicle.move(): moving at "
						+ currentVelocity
						+ " in direction "
						+ currentDirection);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public void setCurrentVelocity(
			int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}

	public int getCurrentDirection() {
		return currentDirection;
	}

	public void setCurrentDirection(
			int currentDirection) {
		this.currentDirection = currentDirection;
	}
	
	public void stop() {
		this.currentVelocity = 0;
	}

}
