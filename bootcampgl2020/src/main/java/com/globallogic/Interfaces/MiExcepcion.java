package com.globallogic.Interfaces;

public class MiExcepcion extends Exception{
	String almacenados = "Almacenados";
	public MiExcepcion() {
		super("carcateres Almacenados ");
	}
	@Override
	public String toString() {
		return "MiExcepcion [almacenados=" + almacenados + "]";
	}
	
}
