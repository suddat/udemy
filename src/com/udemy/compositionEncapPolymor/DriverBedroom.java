package com.udemy.compositionEncapPolymor;

public class DriverBedroom {

	public static void main(String[] args) {
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("North");
		Wall wall4 = new Wall("South");

		Ceiling ceiling = new Ceiling(12,
				"White");

		Bed bed = new Bed("King", 3, 4);

		Lamp lamp = new Lamp("Vintage", false,
				75);

		BedRoom bedRoom = new BedRoom("Suds",
				wall1, wall2, wall3, wall4, bed,
				ceiling, lamp);
		bedRoom.makeBed();
		bedRoom.getLamp().turnOn();
	}

}
