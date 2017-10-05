package pets;

public class VirtualPet {

	// Attributes & initial status
	private String petName;
	private String petDescription;
	private int hungerLevel;
	private int boredomLevel;
	private int thirstLevel;
	private int healthLevel;
	private int cleanlinessLevel;

	public VirtualPet(String petName, String petDescription, int hungerLevel, int boredomLevel, int thirstLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hungerLevel = hungerLevel;
		this.boredomLevel = boredomLevel;
		this.thirstLevel = thirstLevel;
	}

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		hungerLevel = 10;
		boredomLevel = 10;
		thirstLevel = 10;
	}

	// Get methods
	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	// Activities
	void letsEat(int food) {
		hungerLevel += food;
		thirstLevel -= 1;
	}

	void letsPlay(int fun) {
		boredomLevel += fun;
		thirstLevel -= 2;
	}

	void letsDrink(int water) {
		thirstLevel += water;
		hungerLevel -= 1;
		boredomLevel -= 1;
	}

	// Tick method
	public void tickMethod() {
		hungerLevel--;
		boredomLevel -= 2;
		thirstLevel--;
		cleanlinessLevel--;
	}

	public String getPetType() {
		String className = getClass().getSimpleName();
		return className;
	}

}
