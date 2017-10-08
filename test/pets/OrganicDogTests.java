package pets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OrganicDogTests {

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
	public void anOrganicDogShouldBeOrganic() {
		Organic underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToFeedAnOrganicDog() {
		Organic underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		underTest.letsEat();
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToWaterAnOrganicDog() {
		Organic underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		underTest.letsDrink();
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToCleanAnOrganicDogsCage() {
		OrganicDog underTest = new OrganicDog(null, null, 0, 0, 0, 0, 0);
		underTest.letsCleanTheDogCages();
		assertNotNull(underTest);
	}
}
