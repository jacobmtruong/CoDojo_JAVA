package com.jacob.zookeeper;

	public class Bat extends Mammal {
		

		
		
		// ---- CONSTRUCTOR ----
		
		//Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
		
		public Bat() {
			this.setEnergyLevel(300);
		}
		
		
		// ---- OVERLOADING CONSTRUCTOR ----
		public Bat(int HP) {
			super(HP);
		}
		
		
		// ---- METHODS ----
		
		
		//For the fly() method, print the sound of a bat taking off and decrease its energy by 50.
		
		public void fly() {
			System.out.println("swish swish");
			this.setEnergyLevel(getEnergyLevel() - 50);
		}
		
		
		//For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
		
		public void eatHumans() {
			System.out.println("Sorry I craved for blood *,.,*");
			this.setEnergyLevel(getEnergyLevel() + 25);
		}
		
		//For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
		
		public void attackTown() {
			System.out.println("The town is burning! Runnnnnnnnn");
			this.setEnergyLevel(getEnergyLevel() - 100);
		}
}
