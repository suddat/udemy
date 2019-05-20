package com.udemy.compositionEncapPolymor;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;

	public PC(Case theCase, Monitor monitor,
			MotherBoard motherBoard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	public void drawLogo() {
		monitor.drawPixelArt(1400, 700, "yellow");
	}

}
