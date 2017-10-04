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

	// Feed all of the pets in the shelter
	public void feedTheShelter(int food) {
		for (VirtualPet availablePets : availablePets()) {
			availablePets.letsEat(food);
		}
	}

	// Water all of the pets in the shelter
	public void waterTheShelter(int water) {
		for (VirtualPet availablePets : availablePets()) {
			availablePets.letsDrink(water);
		}
	}
}
