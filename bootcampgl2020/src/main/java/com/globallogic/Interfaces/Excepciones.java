package com.globallogic.Interfaces;

public class Excepciones {
	
	public static void main(String[] args) {
		   
		
		
	         try
	         {
	        	 Exception exception1 = new Exception("Se produjo una excepción: Esto es una Excepción");
	        	 throw exception1;
	         }
	         catch(Exception exception1){
	        exception1.printStackTrace();
		         
	         }
	         finally {
	        	 System.out.println("Esto se ejecuta sin importar si se presentan errores");
	         }
	         
	 

	}

}
