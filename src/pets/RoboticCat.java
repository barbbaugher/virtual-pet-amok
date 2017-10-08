package pets;

public class RoboticCat extends VirtualPet implements Robotic {
	
	private int maintenanceLevel;

	public RoboticCat(String petName, String petDescription, int healthLevel, int happinessLevel, int maintenanceLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.maintenanceLevel = maintenanceLevel;
	}

	// Get methods
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	@Override
	public void letsOilTheRobots() {
		maintenanceLevel += 8;
		
	}
	
}
