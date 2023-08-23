package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_std_100")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	
//	@JoinTable(name = "tbl_std_course_join",joinColumns = @JoinColumn(referencedColumnName = "sid",name="sid")
//											, inverseJoinColumns = @JoinColumn(referencedColumnName = "course_id",name="c_id"))
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "std")
	private List<Course> courses;
//	if we do not want to create 
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastmodified;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public Date getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Date lastmodified) {
		this.lastmodified = lastmodified;
	}
	public Student(String name, Date dob, Date lastmodified) {
		super();
		this.name = name;
		this.dob = dob;
		this.lastmodified = lastmodified;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dob=" + dob + ", lastmodified=" + lastmodified + "]";
	}
	
}
