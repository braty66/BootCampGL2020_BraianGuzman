package com.globallogic.Interfaces;

public class Perro extends Animal implements InterfaceAnimal{

	public Perro(String estructuraInterna, String formaDeReproduccion, String tipoDeAlimentacion, String habitat) {
		super(estructuraInterna, formaDeReproduccion, tipoDeAlimentacion, habitat);
		
	}

	public void dormir() {
		
		System.out.println("El perro hace guau guau");
	}

	public void sonidoAnimal() {
		
		System.out.println("Zzz");
	}

	

	


}
