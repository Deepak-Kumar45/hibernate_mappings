package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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

@Entity
@Table(name="tbl_client_annotation")
public class Client 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "client_name")
	private String name;
	private String address;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", address=" + address + ", lastUpdated=" + lastUpdated
				+ ", phnNos=" + phnNos + "]";
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	@Column(name = "Phone_no")
	private Set<PhoneNo> phnNos;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public Set<PhoneNo> getPhnNos() {
		return phnNos;
	}
	public void setPhnNos(Set<PhoneNo> phnNos) {
		this.phnNos = phnNos;
	}
	public Client(String name, String address, Date lastUpdated) {
		super();
		this.name = name;
		this.address = address;
		this.lastUpdated = lastUpdated;
	}
	public Client() {
		super();
	}
	
}
