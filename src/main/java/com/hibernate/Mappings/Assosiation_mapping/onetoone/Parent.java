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
@Table(name = "tbl_parent")
public class Parent 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String str;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "cid",name = "child_forign_key")
	private Child child;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public Parent(String str, Child child, Date lastupdated) {
		super();
		this.str = str;
		this.child = child;
		this.lastupdated = lastupdated;
	}

	public Parent() {
		super();
	}

	@Override
	public String toString() {
		return "Parent [pid=" + pid + ", str=" + str + ", lastupdated=" + lastupdated + "]";
	}

	
		
}
