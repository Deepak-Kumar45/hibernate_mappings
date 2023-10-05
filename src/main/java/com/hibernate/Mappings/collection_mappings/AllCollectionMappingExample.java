package com.hibernate.Mappings.collection_mappings;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="allcollectionmappingexample")
public class AllCollectionMappingExample 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	@Column(name="user_name")
	private String name;
	
	@Override
	public String toString() {
		return  id + " | " + name + " | " + mailId + " | " + fees
				+ " | " + dob + " | " + lastupdated;
	}

	@Column(name="mail_id")
	private String mailId;
	
	@Column
	private Double fees;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@ElementCollection
	@JoinTable(name = "docs_with_annotation",joinColumns = @JoinColumn(referencedColumnName = "user_id"))
	@OrderColumn(name = "idx")
	@Column(name="documents")
	private String[] docs;
	
	@ElementCollection
	@JoinTable(name = "list_with_annotation", joinColumns = @JoinColumn(name = "F_user_id",referencedColumnName = "user_id")) 
	@OrderColumn(name = "idx")
	@Column(name = "subject")
	private List<String> subjects;
	
	@ElementCollection
	@JoinTable(name = "bag_with_annotation",joinColumns = @JoinColumn(referencedColumnName = "user_id"))
	@Column(name = "marks")
	private List<Integer> marks;
	
	@ElementCollection
	@JoinTable(name = "set_with_annotation",joinColumns = @JoinColumn(referencedColumnName = "user_id"))
	@Column(name = "school_dress")
	private Set<String> dress;
	
	@ElementCollection
	@JoinTable(name = "map_with_annotation",joinColumns = @JoinColumn(referencedColumnName = "user_id"))
	@OrderColumn(name = "Map_key")
	@Column(name = "map_Value")
	private Map<String, String> parentDetails;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastupdated;

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

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String[] getDocs() {
		return docs;
	}

	public void setDocs(String[] docs) {
		this.docs = docs;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getDress() {
		return dress;
	}

	public void setDress(Set<String> dress) {
		this.dress = dress;
	}

	public Map<String, String> getParentDetails() {
		return parentDetails;
	}

	public void setParentDetails(Map<String, String> parentDetails) {
		this.parentDetails = parentDetails;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public AllCollectionMappingExample( String name, String mailId, Double fees, Date dob,Date lastupdated) {
		super();
		this.name = name;
		this.mailId = mailId;
		this.fees = fees;
		this.dob = dob;
		this.lastupdated = lastupdated;
	}

	public AllCollectionMappingExample() {
		super();
	}
	
	
}
