package com.globallogic.patronesDediseñoDelegation;

public class ElectricalOven extends ElectricalAppliance{

		LedAppliance eA;
	public ElectricalOven() {
	this.eA = new LedAppliance();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	
	public int turnOn(){
		return setPower(getPower() - 75);
	}
	
	public int turnLed() {
		return   eA.turnOn(power);
	}
	
	
	

	
	}
