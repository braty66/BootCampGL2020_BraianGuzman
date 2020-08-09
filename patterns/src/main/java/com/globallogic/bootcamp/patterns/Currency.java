package com.globallogic.bootcamp.patterns;

public class Currency {
	private String name;
	private Currency instance = new Currency();
	private Currency() {
		this.name = "ARS";
	}
	
	public Currency getInstance() {
		return this.instance;
	}

}
