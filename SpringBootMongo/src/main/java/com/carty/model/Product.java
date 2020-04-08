package com.carty.model;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {

	@Id
	@GeneratedValue
	private int prdId;
	private String prdName;
	private double prdPrice;
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}
	public Product(int prdId, String prdName, double prdPrice) {
		super();
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	
	Product(){}
	
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	

	
	
}
