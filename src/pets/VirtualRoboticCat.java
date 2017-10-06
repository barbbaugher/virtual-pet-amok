package pets;

public class VirtualRoboticCat extends VirtualCat {
	
	private int maintenanceLevel;

	public VirtualRoboticCat(String petName, String petDescription, int healthLevel, int happinessLevel, int maintenanceLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.maintenanceLevel = maintenanceLevel;
	}

	// Get methods
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}
	
}
