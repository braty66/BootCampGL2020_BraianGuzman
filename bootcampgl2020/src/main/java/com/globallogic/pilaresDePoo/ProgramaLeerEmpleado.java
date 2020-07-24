package com.globallogic.pilaresDePoo;

import java.io.IOException;
import java.util.Scanner;

public class ProgramaLeerEmpleado {
	
	
	public static void main(String[] args) throws IOException {
		
		  double importe;
	        Empleado e;
	        leerEmpleados();
	        if (numeroDeEmpleados() > 0) {

	           
	            System.out.println("\n\nEmpleados introducidos: ");
	            mostrar();

	            importe = leerImporteHorasExtras();

	            
	            Empleado.setIMPORTE_HORA_EXTRA(importe);

	            
	            e = empleadoQueMasCobra();
	            System.out.println("\n\nEmpleado que más cobra:");
	            System.out.println(e);
	            System.out.printf("Sueldo: $" + e.calcularSueldoBruto());

	          
	            e = empleadoQueMenosCobra();
	            System.out.println("\n\nEmpleado que menos cobra:");
	            System.out.println(e);
	            System.out.printf("Sueldo: $" + e.calcularSueldoBruto());

	            
	            e = empleadoQueMasCobraPorHorasExtras();
	            System.out.println("\n\nEmpleado que más cobra por horas extras:");
	            System.out.println(e);
	            System.out.printf("Total horas extras: " + e.calculoDeComplementoPorHorasExtras());

	            
	            e = empleadoQueMenosCobraPorHorasExtras();
	            System.out.println("\n\nEmpleado que menos cobra por horas extras:");
	            System.out.println(e);
	            System.out.printf("Total horas extras: " + e.calculoDeComplementoPorHorasExtras());

	         
	            ordenarPorSalario();
	            System.out.println("\n\nEmpleados ordenados por salario:");
	            mostrarEmpleadosYSalarios();

	        }
	    }
		
		
		
	
	
	
	
	public static void leerEmpleados() throws IOException {
		
		 Empleado e;
	        int dni;
			String nombre;
			String id;
	        double sueldoBase;
	        int horasExtras;
	        double tipoIRPF;
	        char casado;  
	        int numeroHijos;
	        int i, N;
	        
	        
	        do {
	            System.out.print("Número de empleados? ");
	            N = sc.nextInt();
	        } while (N < 0 || N > MAXIMO_EMPLEADOS);
	       
	        for (i = 1; i <= N; i++) {
	            sc.nextLine(); 
	            System.out.println("Empleado " + i);
	            System.out.print("Id: ");
	            id = sc.nextLine(); 
	            System.out.print("Nombre: ");
	            nombre = sc.nextLine();
	            System.out.print("Dni: ");
	            dni = sc.nextInt();
	            System.out.print("Sueldo Base: ");
	            sueldoBase = sc.nextDouble();
	            System.out.print("Horas extra: ");
	            horasExtras = sc.nextInt();
	            System.out.print("Tipo de IRPF: ");
	            tipoIRPF = sc.nextDouble();
	            System.out.print("Casado (S/N): ");
	            casado = (char) System.in.read();
	            System.out.print("Número de hijos: ");
	            numeroHijos = sc.nextInt();

	            e = new Empleado(dni);
	            e.setId(id);
	            e.setNombre(nombre);
	            e.setSueldoBase(sueldoBase);
	            e.setHorasExtra(horasExtras);
	            e.setTipoIRPF(tipoIRPF);
	            e.setCasado(Character.toUpperCase(casado));
	            e.setNumeroDeHijos(numeroHijos);

	            empleados[indice] = e; 
	            indice++;
	        }
	        
	        
	        
	        
	    }

	 
	        
	        
	       
		
		
		
	
	
	static int MAXIMO_EMPLEADOS = 20;
	static Empleado[] empleados = new Empleado[MAXIMO_EMPLEADOS];
	static int indice = 0;
    static Scanner sc = new Scanner(System.in);
	
    public static void mostrar() {
        
		for (int i = 0; i < indice; i++) {
            System.out.println(empleados[i]);
        }
    }
		 public static double leerImporteHorasExtras() {
		        double importe;
		        System.out.print("Introduce el importe a pagar por cada hora extra: ");
		        importe = sc.nextDouble();
		        return importe;
		    }
		 public static int numeroDeEmpleados() {
		        return indice;
		    }
		 
		 public static Empleado empleadoQueMasCobra() {
		        Empleado mayor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calcularSueldoBruto() > mayor.calcularSueldoBruto()) {
		                mayor = empleados[i];
		            }
		        }
		        return mayor;
		    }
		 public static Empleado empleadoQueMenosCobra() {
		        Empleado menor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calcularSueldoBruto() < menor.calcularSueldoBruto()) {
		                menor = empleados[i];
		            }
		        }
		        return menor;
		    }
		 public static Empleado empleadoQueMasCobraPorHorasExtras() {
		        Empleado mayor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calculoDeComplementoPorHorasExtras() > mayor.calculoDeComplementoPorHorasExtras()) {
		                mayor = empleados[i];
		            }
		        }
		        return mayor;
		    }
		 
		 public static Empleado empleadoQueMenosCobraPorHorasExtras() {
		        Empleado menor = empleados[0];
		        for (int i = 1; i < indice; i++) {
		            if (empleados[i].calculoDeComplementoPorHorasExtras() < menor.calculoDeComplementoPorHorasExtras()) {                 
		                menor = empleados[i];
		            }
		        }
		        return menor;
		    }
		 public static void ordenarPorSalario() {

		        int i, j;
		        Empleado aux;
		        for (i = 0; i < indice - 1; i++) {
		            for (j = 0; j < indice - i - 1; j++) {
		                if (empleados[j + 1].calcularSueldoBruto() < empleados[j].calcularSueldoBruto()) {
		                    aux = empleados[j + 1];
		                    empleados[j + 1] = empleados[j];
		                    empleados[j] = aux;
		                }
		            }
		        }
		    }
		 public static void mostrarEmpleadosYSalarios() {
		        for (int i = 0; i < indice; i++) {
		            System.out.println(empleados[i]);
		            System.out.printf("Sueldo: $" , empleados[i].calcularSueldoBruto());
		        }
		    }
    
	

    }


