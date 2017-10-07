package pets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RoboticDogTests {

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
	public void aRoboticDogShouldBeRobotic() {
		Robotic underTest = new RoboticDog(null, null, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToOilARoboticDog() {
		Robotic underTest = new RoboticDog(null, null, 0, 0, 0);
		underTest.letsOilTheRobots();
		assertNotNull(underTest);
	}
	
}
