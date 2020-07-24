package com.globallogic.pilaresDePoo;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico electrodomestico = new Electrodomestico("Sanyo", 250.0, 'a', "blanco");
		Heladera heladera = new Heladera("Siam",200.0,'b',"gris",50.0,true,15.0);
		
		System.out.println("marca: " + electrodomestico.marca +  "\n" + "peso: " + electrodomestico.peso + "\n" + "consumo: "  + electrodomestico.consumo + "\n" +"color: " + electrodomestico.color );
		electrodomestico.encender();
		electrodomestico.apagar();
		
		System.out.println("marca: " + heladera.marca +  "\n" + "peso: " + heladera.peso + "\n" + "consumo: "  + heladera.consumo + "\n" +"color: " + heladera.color + "\n" + "capacidad: " + heladera.capacidad + "\n" + "tiene freezer: " + heladera.tieneFreezer + "\n" + "capacidad de freezer: " + heladera.capacidadFreezer +  " litros");
		heladera.encender();
		heladera.apagar();
		heladera.guardarElemento();
		heladera.extraerElemento();
		
		
		Televisor televisor = new Televisor("Sony", 12.0, 'A', "negro", 24.0, "HD 1920 x 1080");
		Cafetera cafetera = new Cafetera ("PHILCO", 5.0, 'A', "blanco", 3);
		
		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>(); 
		
		electrodomesticos.add(heladera);
		electrodomesticos.add(televisor);
		electrodomesticos.add(cafetera);
		
		for (Electrodomestico electrodomestico2 : electrodomesticos) {
			
			electrodomestico2.encender();
		}
	}
		
	

}
