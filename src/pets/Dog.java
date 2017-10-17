package pets;

public abstract class Dog extends VirtualPet {

	public Dog(String petName, String petDescription, int healthLevel, int happinessLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
	}

	public void walkTheDogs() {
		setHappinessLevel(getHappinessLevel() + 7);
	}

}
