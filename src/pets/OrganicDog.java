package pets;

public class OrganicDog extends Dog implements Organic {

	private int hungerLevel;
	private int thirstLevel;
	private int cleanlinessLevel;
	
	public OrganicDog(String petName, String petDescription, int healthLevel, int happinessLevel, int hungerLevel, int thirstLevel, int cleanlinessLevel) {
		super(petName, petDescription, healthLevel, happinessLevel);
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.cleanlinessLevel = cleanlinessLevel;
	}
	
	// Get methods
		public int getHungerLevel() {
			return hungerLevel;
		}
		
		public int getThirstLevel() {
			return thirstLevel;
		}

		public int getCleanlinessLevel() {
			return cleanlinessLevel;
		}

	//Activities	
		public void letsEat() {
			hungerLevel += 10;
			thirstLevel -= 1;
		}

		public void letsDrink() {
			thirstLevel +=8;
			hungerLevel +=2;
		}
		
}
