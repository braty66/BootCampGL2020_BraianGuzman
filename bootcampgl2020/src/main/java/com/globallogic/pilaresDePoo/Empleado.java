package com.globallogic.pilaresDePoo;

public class Empleado extends Persona {

	private String id;
	private String nombre;
	private double sueldoBase;
	private int horasExtra;
	private double tipoIRPF;
	private char casado;
	private int numeroDeHijos;
	private static double IMPORTE_HORA_EXTRA = 500.0;
	
	
	
	public Empleado(int dni, String id, String nombre, double sueldoBase, int horasExtra, double tipoIRPF,
			char casado, int numeroDeHijos) {
		super(dni);
		this.id = id;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
		this.horasExtra = horasExtra;
		this.tipoIRPF = tipoIRPF;
		this.casado = casado;
		this.numeroDeHijos = numeroDeHijos;
	}



	public Empleado(int dni) {
		super(dni);
		
		
	}

	public double calculoDeComplementoPorHorasExtras() {
		double complementoHorasExtra;
		 complementoHorasExtra = horasExtra*IMPORTE_HORA_EXTRA;
		 return complementoHorasExtra;
	}
	
	public int getNumeroDeHijos() {
		return numeroDeHijos;
	}



	public void setNumeroDeHijos(int numeroDeHijos) {
		this.numeroDeHijos = numeroDeHijos;
	}



	public double calcularSueldoBruto() {
		double sueldoBruto;
		sueldoBruto = sueldoBase+calculoDeComplementoPorHorasExtras();
		return sueldoBruto;
	}
	
	 public double calcularRetencionIrpf(){
	        double tipo = tipoIRPF;
	        if(casado == 's' || casado == 'S') {
	            tipo = tipo - 2; 
	        }
	        tipo = tipo - numeroDeHijos;                                                  
	        if(tipo<0){
	            tipo = 0;
	        }
	        return calcularSueldoBruto() * tipo / 100;
	    }

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", horasExtra=" + horasExtra
				+ ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + "]";
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSueldoBase() {
		return sueldoBase;
	}



	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}



	public int getHorasExtra() {
		return horasExtra;
	}



	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}



	public double getTipoIRPF() {
		return tipoIRPF;
	}



	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}



	public char getCasado() {
		return casado;
	}



	public void setCasado(char casado) {
		this.casado = casado;
	}



	public static double getIMPORTE_HORA_EXTRA() {
		return IMPORTE_HORA_EXTRA;
	}



	public static void setIMPORTE_HORA_EXTRA(double iMPORTE_HORA_EXTRA) {
		IMPORTE_HORA_EXTRA = iMPORTE_HORA_EXTRA;
	}
	
	
	

	
	
	
	
		
	}
	 

	
	
		
	


