package com.globallogic.pilaresDePoo;

public class Electrodomestico {
		
		String marca;
		double peso;
		char consumo;
	    String color;
	
	public Electrodomestico(String marca, double peso, char consumo, String color ) {
		this.marca=marca;
		this.peso=peso;
		this.consumo=consumo;
		this.color=color;
	}
	
	public void encender() {
		System.out.println("Encendiendo Electrodomestico");
	}
	public void apagar() {
		System.out.println("Apagando Electrodomestico");
	}
	
}