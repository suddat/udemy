package com.udemy.inheritence;

public class DriverAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1,
				5, 5);

		Dog dog = new Dog("Rotweiller", 8, 20, 2,
				4, 1, 20, "thick");
		
		//dog.eat();
		dog.walk();
		//dog.run();
	}

}
