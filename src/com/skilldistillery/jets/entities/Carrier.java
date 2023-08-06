package com.skilldistillery.jets.entities;

public class Carrier extends Jets implements CargoBoi {

	public Carrier(String model, String name, double speed, int range, double price) {
		super(model, name, speed, range, price);
	}

	public Carrier() {
	}

	@Override
	public void fly() {
		double flightTime = (getRange() / getSpeed());
		System.out.println(this.getClass().getSimpleName() + ": \n" + " Name: " + getName() + "\n Speed: " + getSpeed()
				+ "\n Range: " + getRange() + "\n Price: " + getPrice());
		System.out.println(this.getClass().getSimpleName() + " will fly for " + (int)flightTime + " hours!");
	}

	@Override
	public void loadCargo() {
		System.out.println("Loading Cargo...");
	}

}
