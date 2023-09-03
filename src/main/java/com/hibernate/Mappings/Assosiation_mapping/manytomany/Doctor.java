package com.hibernate.Mappings.Assosiation_mapping.manytomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drId;
	
	@Column(name = "doctor_name")
	private String drName;
	
	private String type;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "doctors",fetch = FetchType.EAGER)
	private List<Patient> patients;
	
	public int getDrId() {
		return drId;
	}
	public void setDrId(int drId) {
		this.drId = drId;
	}
	public String getDrName() {
		return drName;
	}
	@Override
	public String toString() {
		return "Doctor [drId=" + drId + ", drName=" + drName + ", type=" + type + ", lastupdated=" + lastupdated + "]";
	}
	public void setDrName(String drName) {
		this.drName = drName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public Doctor(String drName, String type, Date lastupdated) {
		super();
		this.drName = drName;
		this.type = type;
		this.lastupdated = lastupdated;
	}
	public Doctor() {
		super();
	}
	
}
