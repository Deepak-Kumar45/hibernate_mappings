package com.hibernate.Mappings.simple_mapping;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_Std100")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String course;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	
	@Embedded
	private Letter Letter;
	
	public Letter getAddress() {
		return Letter;
	}
	public void setAddress(Letter Letter) {
		this.Letter = Letter;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Student(String name, String course, Date lastUpdated) {
		super();
		this.name = name;
		this.course = course;
		this.lastUpdated = lastUpdated;
	}
}
