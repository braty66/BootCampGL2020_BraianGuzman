package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;

class GalaxyTest {

	@Test
	public void WhenGalaxyInstatiatesThenOK() {
		Galaxy galaxy = new Galaxy("Orion");
		assertNotNull(galaxy);
	}

}
