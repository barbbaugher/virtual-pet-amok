package pets;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetTests {

	@Test
	public void shouldBeAbleToCreateAVirtualOrganicDog() {
		VirtualOrganicDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToExtendVirtualDogToVirtualOrganicDog() {
		VirtualDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aVirtualDogShouldKnowItsTypeIsVirtualOrganicDog() {
		VirtualDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("VirtualOrganicDog", result);
	}

	@Test
	public void shouldBeAbleToFeedAVirtualOrganicDog() {
		VirtualOrganicDog underTest = new VirtualOrganicDog(null, null, 0, 0, 0, 0, 0);
		String response = underTest.letsEat();
		assertEquals("Nom, nom, nom", response);
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
	public void aVirtualDogShouldKnowItsTypeIsVirtualRoboticDog() {
		VirtualDog underTest = new VirtualRoboticDog(null, null, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("VirtualRoboticDog", result);
	}

	@Test
	public void shouldBeAbleToCreateAVirtualOrganicCat() {
		VirtualOrganicCat underTest = new VirtualOrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToExtendVirtualPetToVirtualOrganicCat() {
		VirtualCat underTest = new VirtualOrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aVirtualCatShouldKnowItsTypeIsVirtualOrganicCat() {
		VirtualCat underTest = new VirtualOrganicCat(null, null, 0, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("VirtualOrganicCat", result);
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

	@Test
	public void aVirtualCatShouldKnowItsTypeIsVirtualRoboticCat() {
		VirtualCat underTest = new VirtualRoboticCat(null, null, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("VirtualRoboticCat", result);
	}
	
	@Test
	public void shouldBeAbleToCreateAVirtualDog() {
		VirtualDog underTest = new VirtualDog(null, null,0,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateAVirtualCat() {
		VirtualCat underTest = new VirtualCat(null, null,0,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void aVirtualDogShouldBeAVirtualPet() {
		VirtualPet underTest = new VirtualDog(null, null,0,0);
		assertNotNull(underTest);
	}

	@Test
	public void aVirtualPetShouldKnowItsTypeIsVirtualDog() {
		VirtualPet underTest = new VirtualDog(null, null,0,0);
		String result = underTest.getPetType();
		assertEquals("VirtualDog", result);
	}

	@Test
	public void aVirtualCatShouldBeAVirtualPet() {
		VirtualPet underTest = new VirtualCat(null, null,0,0);
		assertNotNull(underTest);
	}

	@Test
	public void aVirtualPetShouldKnowItsTypeIsVirtualCat() {
		VirtualPet underTest = new VirtualCat(null, null,0,0);
		String result = underTest.getPetType();
		assertEquals("VirtualCat", result);
	}

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
	//
	// @Test
	// public void aPizzaOvenShouldBeACooker() {
	// Cooker underTest = new PizzaOven();
	// assertNotNull(underTest);
	// }
	//
	// @Test
	// public void aCookerShouldKnowItsTypeIsPizzaOven() {
	// Cooker underTest = new PizzaOven();
	// String result = underTest.getCookerType();
	// assertEquals("PizzaOven", result);
	// }
	//
	// @Test
	// public void cookersShouldCook() {
	// Cooker underTest = new Microwave();
	// assertNotNull(underTest.cook());
	// }
	//
	// @Test
	// public void anElectricRangeShouldBeACooker() {
	// Cooker underTest = new ElectricRange();
	// assertNotNull(underTest);
	// }
	//
	// @Test(expected = InstantiationException.class)
	// public void shouldNotBeAbleToConstructACooker() throws Exception {
	// Cooker.class.newInstance();
	// }
}
