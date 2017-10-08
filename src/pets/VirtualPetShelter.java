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
	public void shelterTickMethod() {
		for (VirtualPet availablePets : availablePets()) {
			availablePets.tickMethod();
		}
		shelterLitterBoxCleanliness--;
	}

	// Feed all of the organic pets in the shelter
	public void feedTheShelter() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Organic) {
				Organic organicPet = (Organic) availablePets;
				organicPet.letsEat();
			}
		}

	}

	// Water all of the organic pets in the shelter
	public void waterTheShelter() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Organic) {
				Organic organicPet = (Organic) availablePets;
				organicPet.letsDrink();
			}
		}
	}

	// Maintain all of the robotic pets in the shelter
	public void maintainTheRobotsInTheShelter() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Robotic) {
				Robotic roboticPet = (Robotic) availablePets;
				roboticPet.letsOilTheRobots();
			}
		}
	}

	// Clean the organic dog cages in the shelter
	public void cleanTheDogCagesInTheShelter() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof OrganicDog) {
				OrganicDog organicDog = (OrganicDog) availablePets;
				organicDog.letsCleanTheDogCages();
			}
		}

	}

	// Walk the dogs in the shelter
	public void walkTheDogsInTheShelter() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Dog) {
				Dog dog = (Dog) availablePets;
				dog.letsWalkTheDogs();
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