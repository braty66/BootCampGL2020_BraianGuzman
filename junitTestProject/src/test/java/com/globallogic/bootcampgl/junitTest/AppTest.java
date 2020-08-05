package com.globallogic.bootcampgl.junitTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class AppTest {

	
	@Test
	
	void test() {
		assertEquals(7656, 2);
	}
	
	@Test
	void testEvaluarTresVAriables() {
		assertEquals("Test", "Test1", "Test");
	}
	
	@Test
	void testMayorYMenor() {
		assertTrue( 25<12);
		assertFalse(25<27);
	}
	@Test
	void testEvaluarLong() {
		Long test = (long) 1;
		assertNull(test);
		test = null;
		assertNotNull(test);
	}
	
	public static int suma(int a , int b) {
		int suma;
		return  suma = a+b;
	}
	
	@Test
	void testSuma() {
		int a = 5; 
		int b = 5;
		int suma = AppTest.suma(a,b);
	   assertEquals(11,suma , "El resultado esta mal: ");
	}
	
	public static boolean metodoDeCorte(int maximo) {
		
		boolean resultado = false ;
		for (int i =0; i<=maximo; i++) {
		if (i ==3) {
		 resultado  = true;
		} if (i < 3) {
			resultado =false;
		}
		
		}
		return resultado;
	}
	@Test
	
	void testBoolean() {
		
		boolean resultado = AppTest.metodoDeCorte(4);
		boolean resultado2 = AppTest.metodoDeCorte(2);
		assertEquals(true, resultado , "Esta variable no es true: ");
		assertEquals(false, resultado2 , "Esta variable no es false: ");
		
	}
	
	
}
