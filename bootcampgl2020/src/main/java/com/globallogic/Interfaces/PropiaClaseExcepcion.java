package com.globallogic.Interfaces;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	try {
		MiExcepcion e = new MiExcepcion();
		throw e;
	}
	catch(MiExcepcion e){
		System.out.println(e.toString());
	}
	}
}
