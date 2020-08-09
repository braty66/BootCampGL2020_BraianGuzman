package coverage.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import coverage.example.model.Planet;

public class PlanetTest {
		
	@Test
	public void WhenToStringThenOK() {
		Planet planet = new Planet();
		planet.setName("Jupiter");
		assertEquals("Planet [name=Jupiter]", planet.toString());
	}

	@Test
	public void WhenHandlesNameThenOK() {
		Planet planet = new Planet();
		planet.setName("Jupiter");
		assertEquals("Jupiter", planet.getName());
	}
}
