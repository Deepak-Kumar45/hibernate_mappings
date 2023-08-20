package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_phnno_annotation")
public class PhoneNo 
{
	@Id
	private long number;
	private String provider;
	private String noType;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getNoType() {
		return noType;
	}
	public void setNoType(String noType) {
		this.noType = noType;
	}
	public PhoneNo(long number, String provider, String noType) {
		super();
		this.number = number;
		this.provider = provider;
		this.noType = noType;
	}
	public PhoneNo() {
		super();
	}
	
}
