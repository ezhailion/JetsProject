package com.skilldistillery.jets.entities;

public class Fighter extends Jets implements FighterBoi {

	public Fighter(String model, String name, double speed, int range, double price) {
		super(model, name, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public Fighter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		double flightTime = (getRange() / getSpeed());
		System.out.println(this.getClass().getSimpleName() + ": \n" + " Name: " + getName() + "\n Speed: " + getSpeed()
				+ "\n Range: " + getRange() + "\n Price: " + getPrice());
		System.out.println(this.getClass().getSimpleName() + " will fly for " + (int)flightTime + " hours!");

	}

	public void canFight() {
		System.out.println("Gun go graa graa");
		fly();
	}
}
