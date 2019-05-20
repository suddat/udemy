package com.udemy.compositionEncapPolymor;

public class DriverPC {

	public static void main(String[] args) {
		Dimensions dimensions = new Dimensions(20,
				20, 5);
		Case theCase = new Case("2200", "Dell",
				"240", dimensions);

		Monitor monitor = new Monitor(
				"27inch Beast", "Acer", 27,
				new Resolution(2540, 1440));
		MotherBoard motherBoard = new MotherBoard(
				"BJ-200", "Asus", 4, 6, "v2.44");
		
		PC thePC = new PC(theCase, monitor, motherBoard);
		
		/*thePC.getMonitor().drawPixelArt(1500, 1200, "red");
		thePC.getMotherBoard().loadProgram("Ubuntu 18.04");
		thePC.getTheCase().pressPowerButton();*/
		thePC.powerUp();
	}

}
