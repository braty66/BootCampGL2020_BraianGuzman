package coverage.loteria;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class TestLoteria {

		
		
	
	
	
	@Test
	public void testGetPozo() {
		CartonGenerator cartonGenerator = new CartonGenerator();
		Loteria loteria = new Loteria(1500,10,cartonGenerator);
		assertEquals(1500, loteria.getPozo());
	}
	@Test
	public void testGetBoletos() {
		CartonGenerator cartonGenerator = new CartonGenerator();
		Loteria loteria = new Loteria(1500,10,cartonGenerator);
		assertEquals(10, loteria.getBoletos());
	}
	@Test
	public void testHayGanadores() {
		CartonGenerator cartonGenerator = new CartonGenerator();
		Loteria loteria = new Loteria(1500,10,cartonGenerator);
		loteria.jugada();
		assertNotNull( loteria.getGanadores());
		
		
		
	}
	@Test
	public void testHayGanadorUnico() {
		CartonGenerator cartonGenerator = new CartonGenerator();
		Loteria loteria = new Loteria(1500,1,cartonGenerator);
		
		assertTrue(loteria.hayGanadorUnico());
	}

	@Test
	public void testHayCuadrupleGanador() {
		CartonGenerator cartonGenerator = new CartonGenerator();
		Loteria loteria = new Loteria(1500,10,cartonGenerator);
		
		loteria.jugada();
		assertFalse(loteria.hayCuadrupleGanador());
	}

	
	
}
