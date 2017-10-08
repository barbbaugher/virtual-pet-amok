package pets;

public abstract class VirtualPet {

	// Attributes & initial status
	private String petName;
	private String petDescription;
	private int healthLevel;
	private int happinessLevel;
	
	public VirtualPet(String petName, String petDescription, int healthLevel, int happinessLevel) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.healthLevel = healthLevel;
		this.happinessLevel = happinessLevel;
	}
	
	public VirtualPet(String petName, String petDescription) {
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

	public int getHealthLevel() {
		return healthLevel;
	}

	public int getHappinessLevel() {
		return happinessLevel;
	}

	// Activities
	void letsPlay(int fun) {
		happinessLevel += fun;
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
