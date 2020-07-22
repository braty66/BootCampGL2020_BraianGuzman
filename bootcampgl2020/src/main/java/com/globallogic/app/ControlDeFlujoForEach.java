package com.globallogic.app;

public class ControlDeFlujoForEach {
	public static void main(String[] args) {
		//ejercicio 4.9
		Integer[] del1Al10 = {1,2,3,4,5,6,7,8,9,10};
		for (Integer num : del1Al10) {
			System.out.println("Valor iterado: " + num );
		}
		//ejercicio 4.10
		String[] semana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		for (String dia : semana) {
			System.out.println("Dia de la semana: "+ dia);
		}
		
		String frase = "BootCamp 2020";
		
		for (char letra  : frase.toCharArray()) {
			System.out.println(letra);
		}
	}
}
