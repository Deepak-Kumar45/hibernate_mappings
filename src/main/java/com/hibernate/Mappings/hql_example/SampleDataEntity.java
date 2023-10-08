package com.hibernate.Mappings.hql_example;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

@Entity
@Table(name="tbl_upload_Data_From_excel")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class SampleDataEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dataid;
	
	private String empid;
	
	private String name;
	
	private String desg;
	private String dept;
	private String gender;
	private int age;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;

	public int getDataid() {
		return dataid;
	}

	public void setDataid(int dataid) {
		this.dataid = dataid;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public SampleDataEntity(String empid, String name, String desg, String dept, String gender, int age, Date date,
			Date lastupdated) {
		super();
		this.empid = empid;
		this.name = name;
		this.desg = desg;
		this.dept = dept;
		this.gender = gender;
		this.age = age;
		this.date = date;
		this.lastupdated = lastupdated;
	}

	public SampleDataEntity() {
		super();
	}

	@Override
	public String toString() {
		return  dataid + " | " + empid + " | " + name + " | " + desg
				+ " | " + dept + " | " + gender + " | " + age + " | " + date + " | "
				+ lastupdated;
	}
	
}
