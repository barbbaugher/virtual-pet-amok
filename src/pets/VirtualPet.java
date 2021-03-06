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

	// Set methods
	public void setHappinessLevel(int happinessLevel) {
		this.happinessLevel = happinessLevel;
	}

	public void setHealthLevel(int healthLevel) {
		this.healthLevel = healthLevel;
	}

	// Activities
	void play() {
		setHappinessLevel(getHappinessLevel() + 10);
	}

	// Tick method
	public abstract void tick();

	// Class name
	public String getPetType() {
		String className = getClass().getSimpleName();
		return className;
	}

}
