package com.udemy.compositionEncapPolymor;

public class MotherBoard {
	private String model;
	private String manufacturer;
	private int ramSlota;
	private int cardslots;
	private String bios;

	public MotherBoard(String model,
			String manufacturer, int ramSlota,
			int cardslots, String bios) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.ramSlota = ramSlota;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	
	//load program
	public void loadProgram(String program) {
		System.out.println("Program "+program+" is now loading...");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(
			String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getRamSlota() {
		return ramSlota;
	}

	public void setRamSlota(int ramSlota) {
		this.ramSlota = ramSlota;
	}

	public int getCardslots() {
		return cardslots;
	}

	public void setCardslots(int cardslots) {
		this.cardslots = cardslots;
	}

	public String getBios() {
		return bios;
	}

	public void setBios(String bios) {
		this.bios = bios;
	}

}
