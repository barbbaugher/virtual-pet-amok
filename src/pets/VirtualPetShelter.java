package pets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int shelterLitterBoxCleanliness = 8;

	// Creating the HashMap
	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	// Displaying the available pets
	public Collection<VirtualPet> availablePets() {
		return petsAvailableForAdoption.values();
	}

	// Get method to return a pet based on a name search
	public VirtualPet getPet(String petName) {
		return petsAvailableForAdoption.get(petName);
	}

	// Are there still pets available for adoption?
	public boolean arePetsAvailable() {
		return petsAvailableForAdoption.isEmpty();
	}

	// Adding a new pet to the shelter
	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		petsAvailableForAdoption.put(adoptablePetSearch, virtualPet);
	}

	// Tick method
	public void tick() {
		for (VirtualPet availablePet : availablePets()) {
			availablePet.tick();
		}
		shelterLitterBoxCleanliness--;
	}

	// Feed all of the organic pets in the shelter
	public void feed() {
		for (VirtualPet availablePet : availablePets()) {
			if (availablePet instanceof Organic) {
				Organic organicPet = (Organic) availablePet;
				organicPet.feed();
			}
		}

	}

	// Water all of the organic pets in the shelter
	public void water() {
		for (VirtualPet availablePet : availablePets()) {
			if (availablePet instanceof Organic) {
				Organic organicPet = (Organic) availablePet;
				organicPet.water();
			}
		}
	}

	// Maintain all of the robotic pets in the shelter
	public void maintainRobots() {
		for (VirtualPet availablePet : availablePets()) {
			if (availablePet instanceof Robotic) {
				Robotic roboticPet = (Robotic) availablePet;
				roboticPet.maintainRobots();
			}
		}
	}

	// Clean the organic dog cages in the shelter
	public void cleanCages() {
		for (VirtualPet availablePet : availablePets()) {
			if (availablePet instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) availablePet;
				organicDog.clean();
			}
		}

	}

	// Walk the dogs in the shelter
	public void walkTheDogs() {
		for (VirtualPet availablePet : availablePets()) {
			if (availablePet instanceof Dog) {
				Dog dog = (Dog) availablePet;
				dog.walkTheDogs();
			}
		}

	}

	// Clean the shelter litter box
	public void cleanTheLitterBox() {
		shelterLitterBoxCleanliness += 7;
	}

	// Get methods
	public int getShelterLitterBoxCleanliness() {
		return shelterLitterBoxCleanliness;
	}
}