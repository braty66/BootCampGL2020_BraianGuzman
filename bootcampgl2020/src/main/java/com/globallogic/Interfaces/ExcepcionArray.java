package com.globallogic.Interfaces;

public class ExcepcionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     int [] array = new int[20];
         try
         {
 		 array[-3] = 24;

	       
         }
         catch(ArrayIndexOutOfBoundsException excepcion)
         {
	         System.out.println("Excepción: índice de array fuera de límites");
         }
	}

}
