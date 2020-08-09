package com.globallogic.bootcamp.patterns;

public class Product {
	
	private String name ;
	private Product instance = new Product();
	
	private Product() {
		this.name ="Clavos";
	}
	
	public Product getInstance() {
		return this.instance;
	}

}
