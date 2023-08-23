package com.hibernate.Mappings.Assosiation_mapping.onetoone.bidirectional;

import java.util.Date;

import javax.persistence.CascadeType;
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
@Table(name="tbl_std_600")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	private String sname;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "add_foriegn_key",referencedColumnName = "add_id")
	private Address address;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastmodified;

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dob=" + dob + ", lastmodified=" + lastmodified + "]";
	}

	public Student() {
		super();
	}

	public Student(String sname, Date dob, Date lastmodified) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.lastmodified = lastmodified;
	}

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

}
