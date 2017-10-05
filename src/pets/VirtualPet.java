package pets;

public class VirtualPet {

	// Attributes & initial status
	private String petName;
	private String petDescription;
	private int healthLevel;
	private int happinessLevel;

	public VirtualPet(String petName, String petDescription, int healthLevel, int happinessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		healthLevel = 10;
		happinessLevel = 10;
	}

	// Get methods
	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

//	public int getHungerLevel() {
//		return hungerLevel;
//	}

//	public int getBoredomLevel() {
//		return boredomLevel;
//	}

//	public int getThirstLevel() {
//		return thirstLevel;
//	}

	// Activities
	void letsEat(int food) {
//		hungerLevel += food;
//		thirstLevel -= 1;
	}

	void letsPlay(int fun) {
//		boredomLevel += fun;
//		thirstLevel -= 2;
	}

	void letsDrink(int water) {
//		thirstLevel += water;
//		hungerLevel -= 1;
//		boredomLevel -= 1;
	}

	// Tick method
	public void tickMethod() {
//		hungerLevel--;
//		boredomLevel -= 2;
//		thirstLevel--;
//		cleanlinessLevel--;
		happinessLevel --;
	}

	public String getPetType() {
		String className = getClass().getSimpleName();
		return className;
	}

}
