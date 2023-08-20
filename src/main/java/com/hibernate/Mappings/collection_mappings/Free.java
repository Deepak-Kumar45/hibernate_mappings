package com.hibernate.Mappings.collection_mappings;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="tbl_free")
public class Free 
{
	public Free(String kuchBhi) {
		super();
		this.kuchBhi = kuchBhi;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getKuchBhi() {
		return kuchBhi;
	}

	public void setKuchBhi(String kuchBhi) {
		this.kuchBhi = kuchBhi;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	private String kuchBhi;
	
	@ElementCollection
	@JoinColumn(referencedColumnName = "user_id",name = "foriegn_key")
	@OrderColumn(name = "idx")
	@Column(name="name")
	private List<String> names;
	
}
