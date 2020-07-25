package com.globallogic.Interfaces;

public class Hombre implements Persona,InterfaceAnimal {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hombre hombre = new Hombre();
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.come("hombre");
		
		
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Los hombres hablan muchos");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Los hombres duermen muchas horas");
	}

	@Override
	public void sonidoAnimal() {
		// TODO Auto-generated method stub
		System.out.println("El hombre no hace sonido animal ");
	}
	public void metodo() {
		System.out.println("Se ejecuta metodo de la clase hombre");
	}

	@Override
	public void come(String s) {
		// TODO Auto-generated method stub
		InterfaceAnimal.super.come(s);
	}

}
