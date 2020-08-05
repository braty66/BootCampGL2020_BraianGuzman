package com.globallogic.patronesDediseñoDelegation;

public class ElectricalAppliance {
	
	protected  int power ;
	
	public ElectricalAppliance() {
		power = 500;
	}
	
	
	
	public int turnOn() {
		return this.power =  power - 50;
	}

	public int getPower() {
		return power;
	}

	public int setPower(int power) {
		return this.power = power;
	}
	
	

}
