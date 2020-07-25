package com.globallogic.Interfaces;

public class ExcepcionNull {
	NullPointerException e = new NullPointerException();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hombre hombre = null; 
		
		
		try{
		
	
	 hombre.dormir();
	
	}
	catch(NullPointerException e){
		System.out.println("Se produjo una excepcion null");
	}
	
	
		
	
         }
	}


