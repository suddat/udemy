package com.udemy.inheritence;

public class DriverVehicle {

	public static void main(String[] args) {
		/*Outlander ferrari = new Outlander(2, 1, 4, 1, 100, "Ferrari");
		
		System.out.println(ferrari.getModelName());
		ferrari.changingGear();*/
		Outlander outlander = new Outlander(36);
		outlander.steer(45);
		outlander.accelerate(30);
		outlander.accelerate(20);
		outlander.accelerate(-42);
	}

}
