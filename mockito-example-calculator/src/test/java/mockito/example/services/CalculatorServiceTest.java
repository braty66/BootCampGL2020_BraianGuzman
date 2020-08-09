/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@InjectMocks
	private CalculatorServiceImpl calculatorService;

	@Mock
	private DataService dataService;
	
	@Mock
	private BasicOperationsService basicOperationsService;
	
	private static int[] listaNumeros;
	
	@BeforeAll
	static void setup() {
		listaNumeros = new int[] { 1, 2, 3, 4, 5 };		
	}
	
	@DisplayName("Ejercicio 3.3  Suma")	
	@Test
	public void testCalculateSum() {
		when(basicOperationsService.add(5, 2)).thenReturn(7.0);		
		assertEquals(7.0, calculatorService.calculateSum(5, 2), .01);
		
		verify(basicOperationsService).add(5,2);
	}
	
	@DisplayName("Ejercicio 3.3  Resta")
	@Test
	public void testCalculateSubstraction() {
		when(basicOperationsService.subtract(10, 2)).thenReturn(8.0);		
		assertEquals(8.0, calculatorService.calculateSubstraction(10, 2), .01);
		
		verify(basicOperationsService).subtract(10,2);
	}
	
	@DisplayName("Ejercicio 3.3  División")
	@Test
	public void testCalculateDivision() throws ZeroDivisionException { 
		when(basicOperationsService.divide(6, 2)).thenReturn(3.0);		
		assertEquals(3.0, calculatorService.calculateDivision(6, 2), .01);
		
		verify(basicOperationsService).divide(4,2);
	}
	
	@DisplayName("Ejercicio 3.3  Multiplicación")
	@Test
	public void testCalculateMultiplication() {
		when(basicOperationsService.multiply(5, 2)).thenReturn(10.0);		
		assertEquals(10.0, calculatorService.calculateMultiplication(5, 2), .01);
		
		verify(basicOperationsService).multiply(5,2);
	}
	
	@DisplayName("Ejercicio 3.4")	
	@Test
	public void testCalculateAverage() {
		
		//when(dataService.getListOfNumbers()).thenReturn(new int[] { 1, 2, 3, 4, 5 });
		when(dataService.getListOfNumbers()).thenReturn(listaNumeros);
		assertEquals(3.0, calculatorService.calculateAverage(), .01);
	}
	
	@DisplayName("Ejercicio 3.5")
	@Test
	public void WhenListIsNullThenNullPointerException() {
		when(dataService.getListOfNumbers()).thenReturn(null);
		
		assertThrows(NullPointerException.class, () -> {
			calculatorService.calculateAverage();
		});
	}
	
	@DisplayName("Ejercicio 3.6")
	@Test
	public void WhenDivisionByZeroThenZeroDivisionException() {
		assertThrows(ZeroDivisionException.class, () -> {
			calculatorService.calculateDivision(4, 0);
		});
		
		verify(basicOperationsService, never()).divide(4,0);
	}
	
	@DisplayName("Ejercicio 3.7")
	@Test
	public void testPrintResultFromCalculateSum() {
		when(basicOperationsService.add(1, 4)).thenReturn(5.0);
		
		Double result = calculatorService.calculateSum(1, 4);
		
		assertEquals("El resultado es: " + result, calculatorService.printResult(result));		
	}
	
	@DisplayName("Ejercicio 3.8")	
	@ParameterizedTest
	@ValueSource(ints = {-4, 0, 2, 8, 30, 1000})
	public void testIsOdd(int input) {
		assertTrue(calculatorService.isEven(input));
	}
	
	@DisplayName("Ejercicio 3.9")
	@Test
	void testSpyBasicOperationsServiceImpl() {
		BasicOperationsService myOperationsSrv = new BasicOperationsServiceImpl();
		BasicOperationsService spyMyOperationsSrv = spy(myOperationsSrv);
		calculatorService.setBasicOperationsService(spyMyOperationsSrv);
		
		calculatorService.calculateSum(2, 3);
		
		verify(spyMyOperationsSrv).add(2.0, 3.0);	
	}
	
	@DisplayName("Ejercicio 3.10")
	@Test
	void testSpyDataServiceImpl() {
		DataServiceImpl myDataService = new DataServiceImpl();
		DataServiceImpl spyMyDataService = spy(myDataService);
		calculatorService.setDataService(spyMyDataService);
				
		when(spyMyDataService.getListOfNumbers()).thenReturn(new int[] {2, 3});
		
		spyMyDataService.setListOfNumbers(new int[] {0, 1, 2, 4, 6, 9});
		
		assertTrue(spyMyDataService.getListOfNumbers().length == 2);		
	}

}
