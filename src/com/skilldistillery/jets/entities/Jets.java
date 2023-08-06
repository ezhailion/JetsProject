package com.skilldistillery.jets.entities;

public abstract class Jets {

	private String model;
	private double speed;
	private int range;
	private double price;
	private String name;

	public Jets() {
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Jets(String model, String name, double speed, int range, double price) {
		super();
		this.model = model;
		this.name = name;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public abstract void fly();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Jets [model=" + model + ", name=" + name + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

}
