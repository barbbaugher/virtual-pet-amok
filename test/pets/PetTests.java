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

}
