package pets;

public class OrganicDog extends Dog implements Organic {

	private int hungerLevel;
	private int thirstLevel;
	private int cleanlinessLevel;

	public OrganicDog(String petName, String petDescription, int healthLevel, int happinessLevel, int hungerLevel,
			int thirstLevel, int cleanlinessLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.cleanlinessLevel = cleanlinessLevel;
	}

	// Get methods
	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getCleanlinessLevel() {
		return cleanlinessLevel;
	}

	// Activities
	public void letsEat() {
		hungerLevel += 10;
		thirstLevel -= 1;
	}

	public void letsDrink() {
		thirstLevel += 8;
	}

	public void letsCleanTheDogCages() {
		cleanlinessLevel += 9;
	}

	// Tick method
	public void tickMethod() {
		hungerLevel--;
		thirstLevel--;
		cleanlinessLevel--;
		setHappinessLevel(getHappinessLevel() - 1);
		if (hungerLevel <= 0 || thirstLevel <= 0 || cleanlinessLevel <= 0 || getHappinessLevel() <= 0) {
			setHealthLevel(getHealthLevel() - 1);
		}
	}

	public void letsWalkTheDogs() {
		super.letsWalkTheDogs();
		cleanlinessLevel += 3;
	}
}
