package com.globallogic.app;

public class StudentDetails {

	public int studentAge(int edad) {
		 int age = edad;
		return age;
	}
	public static void main(String[] args) {
		int edad = 5;
		StudentDetails estudiante = new StudentDetails();
		
		System.out.println(estudiante.studentAge(edad));
		
	}
	
	
		
	
}
