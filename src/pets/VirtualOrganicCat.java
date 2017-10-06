package pets;

public class VirtualOrganicCat extends VirtualCat {
	
	private int hungerLevel;
	private int thirstLevel;

	public VirtualOrganicCat(String petName, String petDescription, int healthLevel, int happinessLevel, int hungerLevel, int thirstLevel) {
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

}
