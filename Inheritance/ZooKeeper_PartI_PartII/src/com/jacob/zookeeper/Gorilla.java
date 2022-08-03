package com.jacob.zookeeper;

public class Gorilla extends Mammal {

	// Create a separate class Gorilla that can throwSomething(), eatBananas(), and
	// climb()

	// For the throwSomething() method, have it print out a message indicating that
	// the gorilla has thrown something, as well as decrease the energy level by 5

	public void throwSomething() {
		System.out.println("Gorilla threw somthing!");
		this.setEnergyLevel(getEnergyLevel() - 5);
	}

	// For the eatBananas() method, have it print out a message indicating the
	// gorilla's satisfaction and increase its energy by 10

	public void eatBahnanahs() {
		System.out.println("Gorilla ate a bahnanah, engerny is up!");
		this.setEnergyLevel(getEnergyLevel() + 10);
	}

	// For the climb() method, have it print out a message indicating the gorilla
	// has climbed a tree and decrease its energy by 10

	public void climb() {
		System.out.println("Gorilla climbed up a tree");
		this.setEnergyLevel(getEnergyLevel() - 10);
	}
}
