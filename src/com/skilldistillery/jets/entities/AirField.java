package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {
	private List<Jets> jets = new ArrayList<>();

	public List<Jets> getJets() {
		return jets;
	}

	public void setJets(List<Jets> jets) {
		this.jets = jets;
	}

	public List<Jets> readFile(String fileName) {
// Use txt info to create new jet in array
		try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] custJet = line.split(",");
				String model = custJet[0];
				String name = custJet[1];
				double speed = Double.parseDouble(custJet[2]);
				int range = Integer.parseInt(custJet[3]);
				double price = Double.parseDouble(custJet[4]);
				Jets jet = null;
				if (model.equals("Passenger")) {
					jet = new PassengerJet(model, name, speed, range, price);
				} else if (model.equals("Carrier")) {
					jet = new Fighter(model, name, speed, range, price);
				} else if (model.equals("Fighter")) {
					jet = new Carrier(model, name, speed, range, price);
				}
				jets.add(jet);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jets;
	}

	public void displayJets() {
		int counter = 0;
		for (Jets jets2 : jets) {
			System.out.println(jets.get(counter));
			counter++;
		}

	}

	public void flyJets() {
		for (Jets jets : jets) {
			if(jets.getRange() < jets.getSpeed()) {
				System.err.println(jets.getName() + " will fly for less than an hour.");
			}else {
				jets.fly();
				
			}
		}
	}

	public void highestSpeed() {
		Jets highestSpeed = new PassengerJet();
		highestSpeed.setSpeed(0);

		for (Jets jets : jets) {
			if (!jets.equals(null) && jets.getSpeed() > highestSpeed.getSpeed()) {
				highestSpeed = jets;
			}
		}
		System.out.println(highestSpeed + " is your fastest jet!");
	}

	public void longestRange() {
		Jets longestRange = new PassengerJet();
		longestRange.setRange(0);
		for (Jets jets : jets) {
			if (!jets.equals(null) && jets.getRange() > longestRange.getRange()) {
				longestRange = jets;
			}
		}
		System.out.println(longestRange + " has the furthest range!");
	}

	public void loadCargo() {
		Jets carrierJets = new Carrier();
		for (Jets jets : jets) {
			if (jets instanceof Carrier) {
				((Carrier) jets).loadCargo();
			}
		}
	}

	public void fightJets() {
		Jets fighterJets = new Fighter();
		for (Jets jets : jets) {
			if (jets instanceof Fighter) {
				((Fighter) jets).canFight();
			}
		}
		System.out.println();
	}

	public Jets remJetFromFleet(int toBeRemoved) {
		return jets.remove(toBeRemoved);
	}

	public String addJet(int choice, String model, String name, double speed, int range, double price) {

		switch (choice) {
		case 1:
			Jets jet = new PassengerJet(model, name, speed, range, price);
			jets.add(jet);
			return jet.toString();
		case 2:
			jet = new Fighter(model, name, speed, range, price);
			jets.add(jet);
			return jet.toString();
		case 3:
			jet = new Carrier(model, name, speed, range, price);
			jets.add(jet);
			return jet.toString();
		}

		return "Error completing that task.";
	}

}
