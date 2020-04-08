package com.carty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //looks for a table named product
@Table(name="product_mvc")  //but you can specify the table name here alternatively
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@Column(name="prd_id")
	int prdId;
	//@Column(name="prd_name")
	String prdName;
	//@Column(name="prd_price")
	double prdPrice;
	
	public Product() {
}
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
	
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	

}
