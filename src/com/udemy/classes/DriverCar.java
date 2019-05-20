package com.udemy.classes;

public class DriverCar {

	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		String st = "";
		st = st+ " full";
		System.out.println(st.trim());
		st.trim();
		//System.out.println(porsche.getModel());
		
		porsche.setModel("carrera1");
		
		System.out.println(porsche.getModel());
		
	}

}