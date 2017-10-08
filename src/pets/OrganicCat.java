package pets;

public class OrganicCat extends VirtualPet implements Organic {

	private int hungerLevel;
	private int thirstLevel;

	public OrganicCat(String petName, String petDescription, int healthLevel, int happinessLevel, int hungerLevel,
			int thirstLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
	}

	// Get methods
	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	// Activities
	public void letsEat() {
		hungerLevel += 9;
		thirstLevel -= 2;
	}

	public void letsDrink() {
		thirstLevel += 8;
	}

	// Tick method
	public void tickMethod() {
		hungerLevel--;
		thirstLevel--;
		setHappinessLevel(getHappinessLevel() - 2);
		if (hungerLevel <= 0 || thirstLevel <= 0 || getHappinessLevel() <= 0) {
			setHealthLevel(getHealthLevel() - 1);
		}
	}

}
