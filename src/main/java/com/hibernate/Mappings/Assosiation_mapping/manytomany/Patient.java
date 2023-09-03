package com.hibernate.Mappings.Assosiation_mapping.manytomany;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ptId;
	
	private String ptName;
	private String diseases;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name = "join_dr_patients",joinColumns = @JoinColumn(name = "patient_ID")
										,inverseJoinColumns = @JoinColumn(name =  "Dr_ID"))									
	private List<Doctor> doctors;
	public int getPtId() {
		return ptId;
	}
	@Override
	public String toString() {
		return "Patient [ptId=" + ptId + ", ptName=" + ptName + ", diseases=" + diseases + ", lastupdated="
				+ lastupdated + "]";
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public String getPtName() {
		return ptName;
	}
	public void setPtName(String ptName) {
		this.ptName = ptName;
	}
	public String getDiseases() {
		return diseases;
	}
	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}
	public Date getLastupdated() {
		return lastupdated;
	}
	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	public Patient(String ptName, String diseases, Date lastupdated) {
		super();
		this.ptName = ptName;
		this.diseases = diseases;
		this.lastupdated = lastupdated;
	}
	public Patient() {
		super();
	}
	
}
