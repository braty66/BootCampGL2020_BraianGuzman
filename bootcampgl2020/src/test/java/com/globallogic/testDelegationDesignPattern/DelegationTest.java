package com.globallogic.testDelegationDesignPattern;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

import com.globallogic.patronesDediseñoDelegation.ElectricalAppliance;
import com.globallogic.patronesDediseñoDelegation.ElectricalOven;

public class DelegationTest {
	
	

	
	@Test
	
	public void testElectricalApplianceGetPower() {
		ElectricalAppliance eA = new ElectricalAppliance();
		assertEquals(500, eA.getPower());
	}
	
	@Test 
	
	public void testElectricalApplianceTurnOn() {
		ElectricalAppliance eA = new ElectricalAppliance();
		assertEquals(450, eA.turnOn());
	}
	@Test
	
	public void testEletricalApplianceSetPower() {
		ElectricalAppliance eA = new ElectricalAppliance();
		eA.setPower(600);
		assertEquals(600, eA.getPower());
	}
	
	@Test
	public void testElectricalOvenTurnOn() {
		ElectricalOven eO = new ElectricalOven();
		assertEquals(425, eO.turnOn());
		
	}
	@Test
	public void testElectricalOvenTurnLed() {
		ElectricalOven eO = new ElectricalOven();
		assertEquals(400, eO.turnLed());
	}
	
	

}
