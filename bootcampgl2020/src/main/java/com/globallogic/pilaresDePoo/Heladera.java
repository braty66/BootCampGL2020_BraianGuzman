package com.globallogic.pilaresDePoo;

public class Heladera extends Electrodomestico{
	
	double capacidad;
	boolean tieneFreezer;
	double capacidadFreezer;

	public Heladera(String marca, double peso, char consumo, String color, double capacidad,boolean tieneFreezer,double capacidadFreezer) {
		super(marca, peso, consumo, color);
		this.capacidad=capacidad;
		this.tieneFreezer=tieneFreezer;
		this.capacidadFreezer=capacidadFreezer;
		
	}
	@Override
	public void encender() {
		System.out.println("Encendiendo la heladera");
	}
	
	public void guardarElemento() {
		System.out.println("Heladera: Elemento guardado");
	}
	public void extraerElemento() {
		System.out.println("Heladera: Elemento extraido");
	}
}
