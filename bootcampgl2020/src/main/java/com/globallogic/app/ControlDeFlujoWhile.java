package com.globallogic.app;

public class ControlDeFlujoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio 4.7
				int iterador = 0;
				while( iterador < 10){
					iterador++;
					System.out.println("Valor iterado: " + iterador );
				}
				//ejercicio 4.8
				int iterador2 = 0;
				while (iterador2 < 50) {
						iterador2++;
						if(iterador2%2 == 0){
							System.out.println("Valor iterado"+" "+iterador2+" "+"par.");
							
						}else {
							System.out.println("Valor iterado"+" "+iterador2+" "+"impar.");
						}
						
				}

	}

}
