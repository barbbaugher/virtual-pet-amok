package pets;

public class RoboticDog extends Dog implements Robotic {

	private int maintenanceLevel;

	public RoboticDog(String petName, String petDescription, int healthLevel, int happinessLevel,
			int maintenanceLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.maintenanceLevel = maintenanceLevel;
	}

	// Get methods
	public int getMaintenanceLevel() {
		return maintenanceLevel;
	}

	@Override
	public void maintainRobots() {
		maintenanceLevel += 10;

	}

	// Tick method
	public void tick() {
		maintenanceLevel--;
		setHappinessLevel(getHappinessLevel() - 1);
		if (maintenanceLevel <= 0 || getHappinessLevel() <= 0) {
			setHealthLevel(getHealthLevel() - 1);
		}
	}
}
