package coverage.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;

import coverage.example.model.Planet;
import coverage.example.model.Star;

public class StarTest {
	@Test
	public void WhenHandlesNameThenOK() {
		Star star = new Star();
		star.setName("d444");
		assertEquals("d444",star.getName());
	}
	
	@Test
	public void WhenHandlesColorThenOK() {
		Star star = new Star();
		assertNull(star.getColor());
	}

	@Test
	public void WhenHandlesPlanetsThenOK() {
		Star star = new Star();
		star.setPlanets(new ArrayList<Planet>());
		assertNotNull(star.getPlanets());
		assertEquals(0, star.getPlanets().size());
	}

	@Test
	public void WhenToStringThenOK() {
		Star star = new Star();
		star.setName("d444");
		star.setPlanets(new ArrayList<Planet>());
		assertEquals("Star [name=d444, planets=[]]", star.toString());
	}

}
