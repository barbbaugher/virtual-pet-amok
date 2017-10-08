package pets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// Creating the HashMap
	Map<String, VirtualPet> petsAvailableForAdoption = new HashMap<>();

	// Displaying the available pets
	public Collection<VirtualPet> availablePets() {
		return petsAvailableForAdoption.values();
	}

	// Creating the OrganicDog HashMap
//	Map<String, OrganicDog> organicDogsAvailableForAdoption = new HashMap<>();

	// Creating the OrganicCat HashMap
//	Map<String, OrganicCat> organicCatsAvailableForAdoption = new HashMap<>();

	// Creating the RoboticDog HashMap
//	Map<String, RoboticDog> roboticDogsAvailableForAdoption = new HashMap<>();

	// Creating the RoboticCat HashMap
//	Map<String, RoboticCat> roboticCatsAvailableForAdoption = new HashMap<>();

	// Displaying the organic dogs available for adoption
//	public Collection<OrganicDog> availableOrganicDogs() {
	//	return organicDogsAvailableForAdoption.values();
//	}

	// Displaying the organic cats available for adoption
//	public Collection<OrganicCat> availableOrangicCats() {
	//	return organicCatsAvailableForAdoption.values();
//	}

	// Displaying the robotic dogs available for adoption
//	public Collection<RoboticDog> availableRoboticDogs() {
	//	return roboticDogsAvailableForAdoption.values();
//	}

	// Displaying the robotic cats available for adoption
//	public Collection<RoboticCat> availableRoboticCats() {
	//	return roboticCatsAvailableForAdoption.values();
//	}

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

}