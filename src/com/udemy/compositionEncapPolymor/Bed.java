package com.udemy.compositionEncapPolymor;

public class Bed {
	private String style;
	private int height;
	private int noOfPillows;

	public Bed(String style, int height,
			int noOfPillows) {
		this.style = style;
		this.height = height;
		this.noOfPillows = noOfPillows;
	}

	public void make() {
		System.out.println("Bed is making");
	}

	public String getStyle() {
		return style;
	}

	public int getHeight() {
		return height;
	}

	public int getNoOfPillows() {
		return noOfPillows;
	}

}
