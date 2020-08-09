package coverage.example;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import coverage.example.model.Galaxy;
import coverage.example.model.Planet;
import coverage.example.model.Star;

class ApplicationTest {
	

 private static final String NAME = "Urano";
 private static final String NAME_S = "Nova";
 private static final String COLOR = "blue";
 public static Planet planet;
 public static Planet planet2;
 public static Star star;
 public  List<Planet> planetas = star.getPlanets(); 
 
 @BeforeAll
 public static void set() {
	 planet = new Planet();
	 planet2 = new Planet();
	 star = new Star();
 }

	
 
 
 
 @Test
	@DisplayName("Test clase planet")
	public void testPlanet() {
	
		
		planet.setName(NAME);
		assertEquals(NAME, planet.getName());

	}
	@Test
	@DisplayName("Test metodo toString clase planet")
	public void testMetodoToString() {
		planet = new Planet();
		String planetToString = "Planet [name=Urano]";
		Planet planet = new Planet();
		planet.setName(NAME);
		assertEquals(planetToString, planet.toString());
	}
	
	@Test
	@DisplayName("Test clase Star set y get name ")
	public void testStarName() {
		
	
	star.setName(NAME_S);
	assertEquals(NAME_S, star.getName());
	}
	
	@Test
	@DisplayName("Test clase Star set y get color ")
	public void testStarColor() {
		
	
	star.setColor(COLOR);
	assertEquals(COLOR, star.getColor());
	}
	
	@Test
	@DisplayName("Test lista clase Star getLista")
	public void testStarList() {
	 
		      
	         
	         
	         planetas.add(planet);
	         planetas.add(planet2);
	         star.setPlanets(planetas);
	        
	         assertEquals(2, planetas.size());
	         
		
	}
	
	@Test
	@DisplayName("test metodo toStringStar")
	public void testMetodoToStringStar() {
		
		String metodoString ="Star [name=grande, planets=[]]"; 
		star.setName("grande");
		star.setColor("gris");
	
	assertEquals(metodoString, star.toString());
	}
	
	@Test
	@DisplayName("test clase galaxy")
	public void testClaseGalaxy() {
		Galaxy andromeda = new Galaxy("andromeda");
		ArrayList<Star>stars = (ArrayList<Star>) andromeda.stars; 
		stars.add(star);
		assertEquals(1, stars.size());
		
	}

		
	
	

}
