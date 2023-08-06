package com.skilldistillery.jets.entities;

public class PassengerJet extends Jets {
	public PassengerJet(String model, String name, double speed, int range, double price) {
		super(model, name, speed, range, price);
	}

	public PassengerJet() {
		super();
	}

	@Override
	public void fly() {
		double flightTime = (getRange() / getSpeed());
		System.out.println(this.getClass().getSimpleName() + ": \n" + " Name: " + getName() + "\n Speed: " + getSpeed()
				+ "\n Range: " + getRange() + "\n Price: " + getPrice());
		System.out.println(this.getClass().getSimpleName() + " will fly for " + (int)flightTime + " hours!");
	}

}
