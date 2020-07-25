package com.globallogic.Interfaces;

public interface Persona {
	
	public void hablar();
	public void dormir();
	default void come(String s) {
		System.out.println("El "+ s + "se alimenta");
	}
}
