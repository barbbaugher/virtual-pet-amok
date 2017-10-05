package pets;

import static org.junit.Assert.*;

import org.junit.Test;

public class _02_VirtualPetTests {

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
