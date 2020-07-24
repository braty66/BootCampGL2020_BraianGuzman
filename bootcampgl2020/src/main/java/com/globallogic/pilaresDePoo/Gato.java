package com.globallogic.pilaresDePoo;

public class Gato {
	
	    private String nombre;
	    private int patas;
	    
	    
	    public Gato(String nombre, int patas ) {
	    	
	    	this.nombre = nombre;
	    	this.patas = patas;
	    	
	    	
	    }


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getPatas() {
			return patas;
		}


		public void setPatas(int patas) {
			this.patas = patas;
		}
	    
		public static void main(String[] args) {
			
			Gato gato = new Gato("cat",4);
			
			gato.setNombre("micha");
			gato.setPatas(8);
			
			System.out.println("El gato se llama " + gato.getNombre()+ " Y tiene " + gato.getPatas()+ " patas");
		}
	    
	   
	

}
