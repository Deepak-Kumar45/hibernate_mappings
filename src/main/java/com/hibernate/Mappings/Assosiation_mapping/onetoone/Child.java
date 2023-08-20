package com.hibernate.Mappings.Assosiation_mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_child")
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cstr;
	private double dub;
	
	public Child(String cstr, double dub) {
		super();
		this.cstr = cstr;
		this.dub = dub;
	}
	public Child() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCstr() {
		return cstr;
	}
	public void setCstr(String cstr) {
		this.cstr = cstr;
	}
	public double getDub() {
		return dub;
	}
	public void setDub(double dub) {
		this.dub = dub;
	}
	
	
}
