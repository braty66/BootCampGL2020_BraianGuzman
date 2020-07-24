package com.globallogic.pilaresDePoo;

public class Cafetera extends Electrodomestico {
	
	double litros;

	public Cafetera(String marca, double peso, char consumo, String color, double litros) {
		super(marca, peso, consumo, color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo la cafetera");
	}
	public void elegirSabor(String sabor) {
		System.out.println("Elegiste " + sabor + "disfrutaló" );
	}
	
	

}
