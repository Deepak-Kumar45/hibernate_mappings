package com.hibernate.Mappings.Assosiation_mapping.onetoone;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_lib_std")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "add_id",name = "address_id")
	private Address address;	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public Student(String name, Address address, Date lastupdated) {
		super();
		this.name = name;
		this.address = address;
		this.lastupdated = lastupdated;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", lastupdated=" + lastupdated + "]";
	}
	public Student() {
		super();
	}
	
	
}
