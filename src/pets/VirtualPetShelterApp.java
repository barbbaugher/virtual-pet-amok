package pets;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating the pet shelter
		VirtualPetShelter petShelter = new VirtualPetShelter();

		// Adding the initial virtual pets available for adoption
		VirtualPet frankie = new OrganicDog("Frankie", "An Italian Greyhound who likes long walks along the Scioto", 10,
				5, 8, 7, 6);
		petShelter.addPet(frankie);
		VirtualPet molly = new RoboticDog("Molly", "A robotic dog who would love to rip the face off the mailman", 10,
				8, 7);
		petShelter.addPet(molly);
		VirtualPet gracie = new OrganicCat("Gracie", "A sweet tabby cat that could stand to lose a few pounds", 10, 10,
				3, 8);
		petShelter.addPet(gracie);
		VirtualPet buck = new OrganicDog("Buck", "A fun loving Mutt that just wants to run and play", 10, 10, 6, 10, 9);
		petShelter.addPet(buck);
		VirtualPet kitty = new RoboticCat("Kitty", "A robotic cat who doesn't like you", 10, 4, 9);
		petShelter.addPet(kitty);

		// The welcome message
		System.out.println(displayWelcomeMessage());

		do {

			// Display pet statuses
			System.out.println("Here is the current status of the organic dogs available for adoption:\n");
			System.out.println("Name \t|Health |Happiness |Hunger |Thirst |Cleanliness");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof OrganicDog) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((OrganicDog) availablePets).getHungerLevel() + "\t   |"
							+ ((OrganicDog) availablePets).getThirstLevel() + "\t   |"
							+ ((OrganicDog) availablePets).getCleanlinessLevel());
				}
			}

			System.out.println("\nHere is the current status of the organic cats available for adoption:\n");
			System.out.println("Name \t|Health |Happiness |Hunger |Thirst |Shelter Litter Box");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof OrganicCat) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((OrganicCat) availablePets).getHungerLevel() + "\t   |"
							+ ((OrganicCat) availablePets).getThirstLevel() + "\t   |"
							+ petShelter.getShelterLitterBoxCleanliness());
				}
			}

			System.out.println("\nHere is the current status of the robotic dogs available for adoption:\n");
			System.out.println("Name \t|Health |Happiness |Maintenance");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof RoboticDog) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((RoboticDog) availablePets).getMaintenanceLevel());
				}
			}

			System.out.println("\nHere is the current status of the robotic cats available for adoption:\n");
			System.out.println("Name \t|Health |Happiness |Maintenance");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof RoboticCat) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((RoboticCat) availablePets).getMaintenanceLevel());
				}
			}

			// The menu display
			System.out.println(displayMenu());

			String menuEntry = input.next();

			switch (menuEntry) {

			case "1":
				petShelter.feed();
				petShelter.tick();
				System.out.println("Nom, nom, nom...\n");
				break;

			case "2":
				petShelter.water();
				petShelter.tick();
				System.out.println("Ahhhhhhhhhhhhhh...\n");
				break;

			case "3":
				System.out.println("Enter the pet's name you would like to play with:\n");
				for (VirtualPet availablePet : petShelter.availablePets()) {
					System.out.println(availablePet.getName() + "\t|" + availablePet.getDescription());
				}
				String petName = input.next();
				petShelter.getPet(petName).play();
				petShelter.tick();
				System.out.println("\n" + petName + " loved play time\n");
				break;

			case "4":
				petShelter.maintainRobots();
				petShelter.tick();
				System.out.println("If I am well oiled I shall soon be all right again\n");
				break;

			case "5":
				petShelter.cleanCages();
				petShelter.tick();
				System.out.println("Squeaky clean\n");
				break;

			case "6":
				petShelter.cleanTheLitterBox();
				petShelter.tick();
				System.out.println("Fresh kitty litter\n");
				break;

			case "7":
				petShelter.walkTheDogs();
				petShelter.tick();
				System.out.println("These paws were made for walking...\n");
				break;

			case "8":
				petShelter.addPet(promptUserForNewOrganicDog(input));
				petShelter.tick();
				break;

			case "9":
				petShelter.addPet(promptUserForNewOrganicCat(input));
				petShelter.tick();
				break;

			case "10":
				petShelter.addPet(promptUserForNewRoboticDog(input));
				petShelter.tick();
				break;

			case "11":
				petShelter.addPet(promptUserForNewRoboticCat(input));
				petShelter.tick();
				break;

			case "12":
				System.out.println("Enter the pet's name you would like to adopt: ");
				petName = input.next();
				petShelter.petsAvailableForAdoption.remove(petName);
				petShelter.tick();
				break;

			// Exit menu
			case "13":
				System.out.println("Thanks for playing.");
				System.exit(0);
				break;

			// Invalid menu option entered
			default:
				System.out.println("Please select a valid menu option.\n");
			}

		} while (petShelter.arePetsAvailable() == false);

		System.out.println("Game over.  All homeless virtual pets have found homes. :)");

		input.close();
	}

	// Welcome message
	private static String displayWelcomeMessage() {
		return "Welcome to the Home for Homeless Virtual Pets\n*Now accepting cats because we have to.\n";
	}

	// Menu display
	private static String displayMenu() {
		return "\nPlease select an option below by entering the corresponding number:\n\n1.  Let's Eat - feed all the organic pets\n2.  Let's Drink - water all the organic pets\n3.  Let's Play - select a pet to play with\n4.  Let's Maintain the Robots - oil all the robotic pets\n5.  Let's Clean the Dog Cages - clean all the organic dog cages\n6.  Let's Clean the Shelter Litter Box - clean the shared shelter litter box\n7.  Let's Walk the Dogs - walk all the dogs in the shelter\n8.  Admit an organic dog to the shelter\n9.  Admit an organic cat to the shelter\n10.  Admit a robotic dog to the shelter\n11.  Admit a robotic cat to the shelter\n12.  Adopt a pet from the shelter\n13.  Exit the program";
	}

	// Admit an organic dog
	private static VirtualPet promptUserForNewOrganicDog(Scanner input) {
		System.out.println("Enter the name of the pet you would like to add:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new OrganicDog(petName, petDescription, 10, 10, 10, 10, 10);
	}

	// Admit an organic cat
	private static VirtualPet promptUserForNewOrganicCat(Scanner input) {
		System.out.println("Enter the name of the pet you would like to add:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new OrganicCat(petName, petDescription, 10, 10, 10, 10);
	}

	// Admit an organic cat
	private static VirtualPet promptUserForNewRoboticDog(Scanner input) {
		System.out.println("Enter the name of the pet you would like to add:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new RoboticDog(petName, petDescription, 10, 10, 10);
	}

	// Admit an organic cat
	private static VirtualPet promptUserForNewRoboticCat(Scanner input) {
		System.out.println("Enter the name of the pet you would like to add:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new RoboticCat(petName, petDescription, 10, 10, 10);
	}

}
