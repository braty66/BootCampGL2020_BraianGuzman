package com.globallogic.app;

public class ControlDeFlujosIf {

	public static void main(String[] args) {
	
	
		//ejercicio 4.1
		
		int a = 3;
		int b = 10;
		
		int suma = a + b;
		if(suma <= 10) {
			System.out.println("La suma de los numeros es :" + " " + suma );
		}else {
			System.out.println("La suma de los numeros es mayor a 10");
		}
		//ejercicio 4.2
		String letra = "A";
		
		
		if (letra.equals(letra.toUpperCase())) {
			
			System.out.println("Es una letra Mayuscula");
			
		}else {
			System.out.println("Es una letra Minuscula");
			
		}
		String letra2 = "b";
         
		if (letra2.equals(letra2.toUpperCase())) {
			
			System.out.println("Es una letra Mayuscula");
			
		}else {
			System.out.println("Es una letra Minuscula");
			
		}
		//ejercicio 4.3
		
		int compra = 400;
		
		
		if(compra == 300 || compra < 350 ){
		int descuento = (compra*20)/100;
		System.out.println("El desuento es de:" + " " + descuento );
		}if (compra > 350) { 
			int descuento = (compra*25)/100;
			System.out.println("El desuento es de:" + " " + descuento );
		}else {
			System.out.println("Sin descuentos, el total es:" + " " + compra);
		}
		
		
		
	
		
		
		
			  
		
		
		
	}

}
