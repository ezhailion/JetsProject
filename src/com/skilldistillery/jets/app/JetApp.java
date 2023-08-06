package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;

public class JetApp {
	Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		JetApp app = new JetApp();
		app.launchApp();
	}

	public void launchApp() {
		int input = 0;
		AirField airfield = new AirField();
		airfield.setJets(airfield.readFile("jets.txt"));
		do {
			displayMenu();
			input = kb.nextInt();
			kb.nextLine();

			userInput(input, airfield);

		} while (input != 9);

	}

	public void displayMenu() {
		System.out.println("Select a number to continue: ");
		System.out.println("1. List the fleet");
		System.out.println("2. Fly all");
		System.out.println("3. View the quickest");
		System.out.println("4. View longest range");
		System.out.println("5. Load all Cargo");
		System.out.println("6. Fight!");
		System.out.println("7. Add to the Fleet ");
		System.out.println("8. Remove from the Fleet");
		System.out.println("9. Exit");
	}

	public void userInput(int input, AirField airfield) {
		switch (input) {
		case 1:
			airfield.displayJets();
			break;

		case 2:
			airfield.flyJets();
			break;

		case 3:
			airfield.highestSpeed();
			break;

		case 4:
			airfield.longestRange();
			break;

		case 5:
			airfield.loadCargo();
			break;

		case 6:
			airfield.fightJets();
			break;

		case 7:

			addNewJet(airfield);
			break;

		case 8:

			System.out.println("Please select the Jet you wish to remove.");
			airfield.displayJets();
			int removeInput = kb.nextInt();
			kb.nextLine();
			airfield.remJetFromFleet(removeInput);

			break;

		case 9:
			System.out.println("Goodbye!");

		}
	}

	public void addNewJet(AirField airfield) {
		String model = "";
		String name = "";
		double speed = 0.0;
		int range = 0;
		double price = 0.0;
		int choice = 0;

		System.out.println("What model would you like to choose?");
		System.out.println("-------1. Passenger-------");
		System.out.println("-------2. Fighter---------");
		System.out.println("-------3. Carrier---------");
		System.out.println("\t 4. Quit");
		choice = kb.nextInt();
		kb.nextLine();

		if (choice == 1) {
			model = "Passenger";
		} else if (choice == 2) {
			model = "Fighter";
		} else if (choice == 3) {
			model = "Carrier";
		}
		do {
			System.out.println("Enter your jet's name: ");
			name = kb.nextLine();
			kb.nextLine();

			System.out.println("Enter your jet's speed: ");
			speed = kb.nextDouble();
			kb.nextLine();

			System.out.println("Enter your jet's range it can fly: ");
			range = kb.nextInt();
			kb.nextLine();

			System.out.println("Enter the price for your jet: ");
			price = kb.nextDouble();
			kb.nextLine();

		} while (model.equals("") && name.equals("") && speed == 0.0 && range == 0 && price == 0.0);

		System.out.println("Your jet has been added to the airfield.");
		airfield.addJet(choice, model, name, speed, range, price);
	}

	public void remJet(AirField airfield) {
		int remJet;
		airfield.displayJets();
		System.out.println("Please select the Jet you would like to remove from the airfield.");
	}

}
