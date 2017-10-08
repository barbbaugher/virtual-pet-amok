package pets;

import org.junit.Test;

public class PetTests {

	@Test(expected = InstantiationException.class)
	public void shouldNotBeAbleToConstructADog() throws Exception {
		Dog.class.newInstance();
	}

	@Test(expected = InstantiationException.class)
	public void shouldNotBeAbleToConstructAVirtualPet() throws Exception {
		VirtualPet.class.newInstance();
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
