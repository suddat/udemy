package com.udemy.polymorphism;

class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	public Car(int cylinders, String name) {
		// super();
		this.engine = true;
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
	}

	public String startEnginer() {
		return "Car --> startEngine";
	}

	public String accelerate() {
		return "Car --> accelerate";
	}

	public String brake() {
		return "Car --> brake";
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine
				+ ", cylinders=" + cylinders
				+ ", name=" + name + ", wheels="
				+ wheels + "]";
	}

}

class Mitsubishi extends Car {

	public Mitsubishi(int cylinders,
			String name) {
		super(cylinders, name);
	}

	@Override
	public String startEnginer() {
		return "Mitsubishi --> startEngine";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi --> accelerate";
	}

	@Override
	public String brake() {
		return "Mitsubishi --> brake";
	}

}

public class CarPoly {

	public static void main(String[] args) {
		Car car = new Car(8, "Stinger");
		car.accelerate();
		car.brake();
		car.startEnginer();
		System.out.println(car);

		Mitsubishi mitsubishi = new Mitsubishi(6,
				"mitsubish 6 cylender");
		System.out.println(
				mitsubishi.startEnginer());
		System.out
				.println(mitsubishi.accelerate());
		System.out.println(mitsubishi.brake());
		
		Ford ford = new Ford(6,
				"Ford 6 Falcon");
		System.out.println(
				ford.startEnginer());
		System.out
				.println(ford.accelerate());
		System.out.println(ford.brake());
	}

}
