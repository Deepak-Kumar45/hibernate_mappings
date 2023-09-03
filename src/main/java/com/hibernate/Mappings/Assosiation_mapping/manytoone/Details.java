package com.hibernate.Mappings.Assosiation_mapping.manytoone;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String productType;
	
	@Temporal(TemporalType.DATE)
	private Date expireDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "product_id")
	private Product product;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Details(String productType, Date expireDate) {
		super();
		this.productType = productType;
		this.expireDate = expireDate;
	}

	public Details() {
		super();
	}

	@Override
	public String toString() {
		return "Details [did=" + did + ", productType=" + productType + ", expireDate=" + expireDate + ", product="
				+ product + "]";
	}
	
}
