package pets;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Creating the pet shelter
		VirtualPetShelter petShelter = new VirtualPetShelter();

		// Adding the initial virtual pets available for adoption
		VirtualPet frankie = new VirtualPet("Frankie", "An Italian Greyhound who likes long walks along the Scioto", 8,
				5, 7);
		petShelter.addPet(frankie);
		VirtualPet molly = new VirtualPet("Molly", "A Jug who would love to rip the face off the mailman", 5, 7, 9);
		petShelter.addPet(molly);
		VirtualPet gracie = new VirtualPet("Gracie", "A sweet Puggle that could stand to lose a few pounds", 3, 10, 8);
		petShelter.addPet(gracie);
		VirtualPet buck = new VirtualPet("Buck", "A fun loving Mutt that just wants to run and play", 6, 3, 10);
		petShelter.addPet(buck);

		// The welcome message
		System.out.println(displayWelcomeMessage());

		do {

			// Display pet statuses
			System.out.println("Here is the current status of the pets available for adoption:\n");
			System.out.println("Name \t|Hunger |Thirst |Boredom");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				System.out.println(availablePets.getName() + "\t|" + availablePets.getHungerLevel() + "\t|"
						+ availablePets.getThirstLevel() + "\t|" + availablePets.getBoredomLevel());
			}

			// The menu display
			System.out.println(displayMenu());

			String menuEntry = input.next();

			switch (menuEntry) {

			case "1":
				int food = 6;
				petShelter.feedTheShelter(food);
				petShelter.shelterTickMethod();
				System.out.println("Nom, nom, nom...\n");
				break;

			case "2":
				int water = 5;
				petShelter.waterTheShelter(water);
				petShelter.shelterTickMethod();
				System.out.println("Ahhhhhhhhhhhhhh...\n");
				break;

			case "3":
				int fun = 10;
				System.out.println("Enter the pet's name you would like to play with:\n");
				for (VirtualPet availablePets : petShelter.availablePets()) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getDescription());
				}
				String petName = input.next();
				petShelter.getPet(petName).letsPlay(fun);
				petShelter.shelterTickMethod();
				System.out.println(petName + " loved play time\n");
				break;

			case "4":
				petShelter.addPet(promptUserForNewPet(input));
				petShelter.shelterTickMethod();
				break;

			case "5":
				System.out.println("Enter the pet's name you would like to adopt: ");
				petName = input.next();
				petShelter.petsAvailableForAdoption.remove(petName);
				petShelter.shelterTickMethod();
				break;

			// Exit menu
			case "6":
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
		return "Welcome to the Home for Homeless Virtual Pets\n*Unless you are a virtual cat... no virtual cats allowed.\n";
	}

	// Menu display
	private static String displayMenu() {
		return "\nPlease select an option below by entering the corresponding number:\n\n1.  Let's Eat - feed all the pets\n2.  Let's Drink - water all the pets\n3.  Let's Play - select a pet to play with\n4.  Admit a pet to the shelter\n5.  Adopt a pet from the shelter\n6.  Exit the program";
	}

	// Admit a pet
	private static VirtualPet promptUserForNewPet(Scanner input) {
		System.out.println("Enter the name of the pet you would like to add:");
		String petName = input.next();
		System.out.println("Enter the description of the pet:");
		String petDescription = input.next();
		return new VirtualPet(petName, petDescription);
	}

}
