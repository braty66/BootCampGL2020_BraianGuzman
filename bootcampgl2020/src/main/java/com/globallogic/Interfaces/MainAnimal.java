package com.globallogic.Interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		
		Perro dog = new Perro("vertebrado", "vivíparo","carnívoro","terrestre");
		
		dog.dormir();
		dog.sonidoAnimal();
		dog.come("perro");
		InterfaceAnimal.camina("perro");
	}

}
