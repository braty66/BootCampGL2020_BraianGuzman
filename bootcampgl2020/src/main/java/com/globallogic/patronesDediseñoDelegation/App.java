package com.globallogic.patronesDediseñoDelegation;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ElectricalOven electricalOven  = new ElectricalOven();
		
		System.out.println("ElectricalOven energia inicial: " );
		System.out.println("ElectricalOven se está encendiendo su energia restatante es : " + electricalOven.turnOn());
		System.out.println("Encendiendo led su energia restante es : " + electricalOven.turnLed() );
	}

}
