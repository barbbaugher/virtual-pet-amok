package pets;

public class VirtualRoboticDog extends VirtualDog {
	
	private int maintenanceLevel;

	public VirtualRoboticDog(String petName, String petDescription, int healthLevel, int happinessLevel, int maintenanceLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.maintenanceLevel = maintenanceLevel;
	}
	
	// Get methods
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

}
