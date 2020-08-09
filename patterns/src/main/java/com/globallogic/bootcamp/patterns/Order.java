package com.globallogic.bootcamp.patterns;

public class Order {
	
	private String descrption;
	private Integer count;
	private Currency currency;
	private Product product;
	
	
	public Order(String descrption, Integer count, Currency currency, Product product) {
		
		this.descrption = descrption;
		this.count = count;
		this.currency = currency;
		this.product = product;
	}
	public Order(String descrption, Integer count, Currency currency) {
		
		this.descrption = descrption;
		this.count = count;
		this.currency = currency;
	
	
	
	
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
