package pets;

import static org.junit.Assert.*;

import org.junit.Test;

public class _01_PetTypeTests {

	@Test
	public void shouldBeAbleToCreateAVirtualOrganicDog() {
		VirtualOrganicDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToExtendVirtualDogToVirtualOrganicDog() {
		VirtualDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCreateAVirtualRoboticDog() {
		VirtualRoboticDog underTest = new VirtualRoboticDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToExtendVirtualDogToVirtualRoboticDog() {
		VirtualDog underTest = new VirtualRoboticDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCreateAVirtualOrganicCat() {
		VirtualOrganicCat underTest = new VirtualOrganicCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToExtendVirtualPetToVirtualOrganicCat() {
		VirtualCat underTest = new VirtualOrganicCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCreateAVirtualRoboticCat() {
		VirtualRoboticCat underTest = new VirtualRoboticCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToExtendVirtualPetToVirtualRoboticCat() {
		VirtualCat underTest = new VirtualRoboticCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	// @Test
	// public void shouldBeAbleToCookWithAMicrowave() {
	// Microwave underTest = new Microwave();
	// String response = underTest.cook();
	// assertEquals("Cooking by spinning polar molecules!", response);
	// }
	//
	// @Test
	// public void shouldBeAbleToCookWithAPizzaOven() {
	// PizzaOven underTest = new PizzaOven();
	// String response = underTest.cook();
	// assertEquals("Cooking over wood fire!", response);
	// }
	//
	// @Test
	// public void shouldBeAbleToCookWithAnElectricRange() {
	//
	// ElectricRange underTest = new ElectricRange();
	// String response = underTest.cook();
	// assertEquals("Cooking on a hot surface!", response);
	// }

}
