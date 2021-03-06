package pets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OrganicCatTests {

	@Test
	public void shouldBeAbleToCreateAnOrganicCat() {
		OrganicCat underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void anOrganicCatShouldBeAVirtualPet() {
		VirtualPet underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void aCatShouldKnowItsTypeIsOrganicCat() {
		VirtualPet underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		String result = underTest.getPetType();
		assertEquals("OrganicCat", result);
	}

	@Test
	public void anOrganicCatShouldBeOrganic() {
		Organic underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToFeedAnOrganicCat() {
		Organic underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		underTest.feed();
		assertNotNull(underTest);
	}

	@Test
	public void shouldBeAbleToWaterAnOrganicCat() {
		Organic underTest = new OrganicCat(null, null, 0, 0, 0, 0);
		underTest.water();
		assertNotNull(underTest);
	}

}
