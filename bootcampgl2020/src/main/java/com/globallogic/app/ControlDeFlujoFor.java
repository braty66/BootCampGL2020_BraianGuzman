package com.globallogic.app;

public class ControlDeFlujoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio 4.4 
		
				for(int i = 1; i<=10;i++) {
					
					System.out.println("Valor iterado : "+ i );
					
				}
				
				// ejercico 4.5
				int contador =0;
				for (int i = 0; i <= 1000;i++) {
					if(i % 20 == 0) {
						 contador++;
					}
					
				}
				System.out.println("Contador final : " + contador);
				
				//ejecicio 4.6
				
				String[] semana= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
				
				for(int i = 0; i<=semana.length-1 ;i++) {
					System.out.println("Dia de la semana: " + semana[i]);
				}
	}

}
