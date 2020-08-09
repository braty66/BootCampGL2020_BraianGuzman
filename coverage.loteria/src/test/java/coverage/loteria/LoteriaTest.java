package coverage.loteria;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import coverage.loteria.model.CartonGenerator;

public class LoteriaTest {
	@Test
	void WhenJugadaThen() {
		Loteria loteria = new Loteria(100, 1000, new CartonGenerator());
		
		assertFalse(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(1000,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
		assertEquals(0,loteria.getGanadores());
		loteria.jugada();	

		// Es poco probable que haya ganadores
		assertEquals(0,loteria.getGanadores());
		assertFalse(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
		assertEquals(0,loteria.getBoletos()); 
		assertEquals(100,loteria.getPozo());
	}
}
