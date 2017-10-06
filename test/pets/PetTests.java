package pets;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetTests {

	@Test
	public void shouldBeAbleToCreateAnOrganicDog() {
		OrganicDog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void anOrganicDogShouldBeADog() {
		Dog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aDogShouldKnowItsTypeIsOrganicDog() {
		Dog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("OrganicDog", result);
	}

	@Test
	public void shouldBeAbleToFeedAnOrganicDog() {
		OrganicDog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		String response = underTest.letsEat();
		assertEquals("Nom, nom, nom", response);
	}

	@Test
	public void shouldBeAbleToCreateARoboticDog() {
		RoboticDog underTest = new RoboticDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void aRoboticDogShouldBeADog() {
		Dog underTest = new RoboticDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aDogShouldKnowItsTypeIsRoboticDog() {
		Dog underTest = new RoboticDog(null, null, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("RoboticDog", result);
	}

	@Test
	public void shouldBeAbleToCreateAnOrganicCat() {
		OrganicCat underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void anOrganicCatShouldBeACat() {
		Cat underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aCatShouldKnowItsTypeIsOrganicCat() {
		Cat underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("OrganicCat", result);
	}

	@Test
	public void shouldBeAbleToCreateARoboticCat() {
		RoboticCat underTest = new RoboticCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void aRoboticCatShouldBeACat() {
		Cat underTest = new RoboticCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aCatShouldKnowItsTypeIsRoboticCat() {
		Cat underTest = new RoboticCat(null, null, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("RoboticCat", result);
	}
	
	@Test
	public void shouldBeAbleToCreateADog() {
		Dog underTest = new Dog(null, null,0,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void aDogShouldBeAVirtualPet() {
		VirtualPet underTest = new Dog(null, null,0,0);
		assertNotNull(underTest);
	}
	
	@Test
	public void aVirtualPetShouldKnowItsTypeIsADog() {
		VirtualPet underTest = new Dog(null, null,0,0);
		String result = underTest.getPetType();
		assertEquals("Dog", result);
	}
	
	@Test
	public void shouldBeAbleToCreateACat() {
		Cat underTest = new Cat(null, null,0,0);
		assertNotNull(underTest);
	}

	@Test
	public void aCatShouldBeAVirtualPet() {
		VirtualPet underTest = new Cat(null, null,0,0);
		assertNotNull(underTest);
	}

	@Test
	public void aVirtualPetShouldKnowItsTypeIsACat() {
		VirtualPet underTest = new Cat(null, null,0,0);
		String result = underTest.getPetType();
		assertEquals("Cat", result);
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
