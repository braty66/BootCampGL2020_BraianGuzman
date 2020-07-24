package com.globallogic.pilaresDePoo;

public class Televisor extends Electrodomestico {

		double pulgadas ;
		String resolucion;
	public Televisor(String marca, double peso, char consumo, String color, double pulgadas, String resolucion) {
		super(marca, peso, consumo, color);
		this.pulgadas=pulgadas;
		this.resolucion=resolucion;
		
		
		
		}
	
	
	
	@Override
	public void encender() {
		System.out.println("Encendiendo el televisor");
	}
	public void cambiarCanal(int canal) {
		System.out.println("Canal elegido " + canal );
	}
	
	

}
