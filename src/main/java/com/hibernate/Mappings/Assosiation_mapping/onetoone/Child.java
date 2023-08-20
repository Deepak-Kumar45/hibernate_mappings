package com.hibernate.Mappings.Assosiation_mapping.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_child")
public class Child {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	private String cstr;
	private double dub;
	
	@OneToOne(mappedBy = "child")
	private Parent parent;
//	 now here when ever we use @OneToOne mapping so it will create a column that contains foriegn key
//	so when we do bi-directonal mapping both table will contain the foriegn key main table contain foriegn key
//	will store the id of child class but the child class foriegn key column contains null so to 
//	remove this embiguity we use mappedby attibute anf tell the hibernate that we are mapping this class
//	by main foriegn key.

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

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Child(String cstr, double dub, Parent parent) {
		super();
		this.cstr = cstr;
		this.dub = dub;
		this.parent = parent;
	}

	public Child() {
		super();
	}

	@Override
	public String toString() {
		return "Child [cid=" + cid + ", cstr=" + cstr + ", dub=" + dub + "]";
	}

		
}
