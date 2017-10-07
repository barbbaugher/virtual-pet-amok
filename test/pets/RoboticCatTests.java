package pets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RoboticCatTests {

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
	public void aRoboticCatShouldBeRobotic() {
		Robotic underTest = new RoboticCat(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToOilARoboticCat() {
		Robotic underTest = new RoboticCat(null, null, 0, 0, 0);
		underTest.letsOilTheRobots();
		assertNotNull(underTest);
	}
}
