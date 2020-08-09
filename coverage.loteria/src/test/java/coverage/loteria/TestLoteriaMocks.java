package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Random;

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
	
	@Test
	void WhenJugadaPreparadaThenOK() {
		
		Mockito.when(cartonGeneratorMock.isGanador()).thenReturn(true,false);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorMock);
		loteria.jugada();
		
		assertTrue(loteria.hayGanadorUnico());   
		assertFalse(loteria.hayCuadrupleGanador()); 
	}
	
	@InjectMocks
	CartonGenerator cartonGeneratorInjectMock;
	
	@Mock
	Random rand;
	
	@Test
	void WhenJugadaExcepcionalThenOK() {
		
		
		Mockito.when(rand.nextInt()).thenReturn(1,1,1,1,0);
		
		Loteria loteria = new Loteria(100, 1000, cartonGeneratorInjectMock);
		loteria.jugada();
		
		assertFalse(loteria.hayGanadorUnico());   
		assertTrue(loteria.hayCuadrupleGanador()); 
	}	
	
	

}
