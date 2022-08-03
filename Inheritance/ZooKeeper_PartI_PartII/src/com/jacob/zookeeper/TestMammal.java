package com.jacob.zookeeper;

public class TestMammal {

	public static void main(String[] args) {

		Mammal randomMammal = new Mammal();

		randomMammal.displayEnergy();

		// Create a GorillaTest class to instantiate a gorilla and have it throw three
		// things, eat bananas twice, and climb once.

		Gorilla gorilla1 = new Gorilla();

		//throw three things
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		gorilla1.throwSomething();
		
		gorilla1.displayEnergy();
		
		//eat bananas twice
		
		gorilla1.eatBahnanahs();
		gorilla1.eatBahnanahs();
		
		gorilla1.displayEnergy();
		
		//climb once
		
		gorilla1.climb();
		
		gorilla1.displayEnergy();
		
		//Create a BatTest class to instantiate a bat and have it 			attack three towns, eat two humans, and fly twice.
		
		
		//Bat bat1 = new Bat(200);
		Bat bat1 = new Bat();
		bat1.displayEnergy();
		
		//attack three towns
		bat1.attackTown();
		bat1.attackTown();
		bat1.attackTown();
		
		bat1.displayEnergy();
		
		//eat two humans
		bat1.eatHumans();
		bat1.eatHumans();
		
		bat1.displayEnergy();
		
		//fly twice
		bat1.fly();
		bat1.fly();
		
		bat1.displayEnergy();
	}

}
