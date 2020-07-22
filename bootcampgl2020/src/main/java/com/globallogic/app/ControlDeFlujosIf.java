package com.globallogic.app;

public class ControlDeFlujosIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 10;
		
		int suma = a + b;
		if(suma <= 10) {
			System.out.println("La suma de los numeros es :" + " " + suma );
		}else {
			System.out.println("La suma de los numeros es mayor a 10");
		}
		
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
		
	}

}
