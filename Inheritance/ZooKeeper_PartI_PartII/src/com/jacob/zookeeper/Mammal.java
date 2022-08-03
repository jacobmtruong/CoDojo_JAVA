package com.jacob.zookeeper;

public class Mammal {

	// Create a Mammal class that has an energyLevel member variable and
	// displayEnergy() method. The displayEnergy() method should show the animal's
	// energy level as well as return it.
	
	private int energyLevel = 0;
	
	public Mammal() {
		this.energyLevel = 20;
	}
	
	public Mammal(int HP) {
		this.energyLevel = HP;
	}
	
	
	

	public void displayEnergy() {
		System.out.println(this.getEnergyLevel());
	}
	
	
	
	
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
