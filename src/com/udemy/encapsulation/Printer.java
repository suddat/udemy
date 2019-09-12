package com.udemy.encapsulation;

public class Printer {
	private int tonnerLevel;
	private int pages;
	private boolean isDuplex;

	public Printer(int tonnerLevel,
			boolean isDuplex) {
		if (tonnerLevel > -1
				&& tonnerLevel <= 100) {
			this.tonnerLevel = tonnerLevel;
		} else {
			this.tonnerLevel = -1;
		}
		this.isDuplex = isDuplex;
		this.pages = 0;
	}

	public int addToner(int tonnerAmount) {
		if (tonnerAmount > 0
				&& tonnerAmount <= 100) {
			if (this.tonnerLevel
					+ tonnerAmount > 100) {
				return -1;
			}
			this.tonnerLevel += tonnerAmount;
			return this.tonnerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (isDuplex) {
			pagesToPrint = (pages / 2)
					+ (pages % 2);
			System.out.println(
					"Printing both sides");
		}
		this.pages += pagesToPrint;
		return pagesToPrint;
	}

	public int getTonnerLevel() {
		return tonnerLevel;
	}

	public int getPages() {
		return pages;
	}

}
