package com.skilldistillery.jets.entities;

public abstract class Jets {

	private String model;
	private double speed;
	private int range;
	private double price;

	public Jets(String model, double speed, int range, double price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	@Override
	public String toString() {
		return "Jets [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}
}
