package com.globallogic.bootcamp.patterns;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
public class TestSingleton {
	
	
	@InjectMocks Currency c;
	
	@Mock Product p;
	
	@Test
	@DisplayName("ejercicio 1.2")
	public void testGetIntance2Veces() {
	  Currency a=	c.getInstance();
		
		assertEquals(a, c.getInstance());
	} 
	
	@Test
	@DisplayName("ejercicio 1.3")
	public void testOrderTengaDiferentesIntanciasConElMismoCurrency() {
		
		Order o = new Order("a", 2, c);
		Order b = new Order("b", 2, c);
		
		assertEquals(o.getCurrency().getInstance(), b.getCurrency().getInstance());
		
		
	}
	
	@Test
	@DisplayName("ejercicio 1.4")
	public void testProductDEevuelvaLaMismaIntancia() {
		
		Order o = new Order("a", 2, c,p);
		Order b = new Order("b", 2, c,p);
		
		assertEquals(o.getProduct().getInstance(), b.getProduct().getInstance());
	}
	
	

}
