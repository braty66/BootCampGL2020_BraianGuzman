package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mockitoSession;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import coverage.loteria.model.CartonGenerator;

@ExtendWith(MockitoExtension.class)

public class TestLoteriaMocks {
	
	@Mock CartonGenerator cartonGeneratorMock ;
	
	Loteria loteria;
	
	private static final float POZO = 1500;
	
	

	@Test
	public void testGetLoteria() {
		loteria= new Loteria(POZO,2,cartonGeneratorMock);
		assertEquals(POZO, loteria.getPozo());
	}
	@Test 
	public void testGetBoletos() {
		loteria= new Loteria(POZO,2,cartonGeneratorMock);
		assertEquals(2, loteria.getBoletos());
	}
	@Test 
	public void testGetGanadores() {
		
		loteria= new Loteria(POZO,1,cartonGeneratorMock);
		
		loteria.jugada();
		assertEquals(1, loteria.getGanadores());
		
	}
	@Test
	public void testHayGanadorUnico(){
		loteria= new Loteria(POZO,1,cartonGeneratorMock);
	  
		assertTrue(loteria.hayGanadorUnico());
		
	
	
	
	
	}
	

	@Test
	public void testHayCuadrupleGanador() {
		
		Loteria loteria2= new Loteria(POZO,4,cartonGeneratorMock);
		
	loteria2.jugada();
	assertTrue(loteria2.hayCuadrupleGanador());
		
	}
	
	

}
