package com.udemy.inheritence;

public class Outlander extends Car {
	/*
	 * private int km; private String modelName;
	 * 
	 * public Supercar(int seats, int typeOfGears, int wheels, int airBags, int km,
	 * String modelName) { super(seats, typeOfGears, wheels, airBags); this.km = km;
	 * this.modelName = modelName; }
	 * 
	 * public int getKm() { return km; }
	 * 
	 * public void setKm(int km) { this.km = km; }
	 * 
	 * public String getModelName() { return modelName; }
	 * 
	 * public void setModelName(String modelName) { this.modelName = modelName; }
	 * 
	 * public void changingGear() { if(km > 0) System.out.println("gears Changed");
	 * else System.out.println("Car is Still"); }
	 */

	private int roadServiceMonths;

	public Outlander(int roadServiceMonths) {
		super("Outlander", "4WD", 5, 5, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public int getRoadServiceMonths() {
		return roadServiceMonths;
	}

	public void setRoadServiceMonths(
			int roadServiceMonths) {
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate) {
		System.out.println("Outlander.getCurrentVelocity: "+getCurrentVelocity());
		int new_velocity = getCurrentVelocity()
				+ rate;
		if (new_velocity == 0) {
			stop();
			changeGear(1);
		} else if (new_velocity > 0
				&& new_velocity <= 10) {
			changeGear(1);
		} else if (new_velocity > 10
				&& new_velocity <= 20) {
			changeGear(2);
		} else if (new_velocity > 20
				&& new_velocity <= 30) {
			changeGear(3);
		} else {
			changeGear(4);
		}
		if (new_velocity > 0) {
			changeVelocity(new_velocity,
					getCurrentDirection());
		}
	}

}
