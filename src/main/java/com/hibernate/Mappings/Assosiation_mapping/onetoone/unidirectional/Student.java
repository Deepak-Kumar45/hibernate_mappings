package com.hibernate.Mappings.Assosiation_mapping.onetoone.unidirectional;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tbl_std_500")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "std_id")
	private int sid;
	
	private String sname;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "add_id",name = "address_id")
//	@JoinTable(name = "tbl_std_addr500",joinColumns = @JoinColumn(referencedColumnName = "add_id"),inverseJoinColumns = @JoinColumn(referencedColumnName = "std_id"))
	private Address address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastmodified;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}
	public Student(String sname, Date dob, Date lastmodified) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.lastmodified = lastmodified;
	}
	@Override
	public String toString() {
		return "Student [" + sid + " | " + sname + " | " + dob + " | " + lastmodified + "]";
	}
	public Student() {
		super();
	}
	
}
