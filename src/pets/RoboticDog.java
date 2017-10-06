package pets;

public class RoboticDog extends Dog {
	
	private int maintenanceLevel;

	public RoboticDog(String petName, String petDescription, int healthLevel, int happinessLevel, int maintenanceLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.maintenanceLevel = maintenanceLevel;
	}
	
	// Get methods
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

}
