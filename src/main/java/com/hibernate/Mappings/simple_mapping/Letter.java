package com.hibernate.Mappings.simple_mapping;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Letter {
	public Letter() {
		super();
	}
	public Letter(String street, String city, String state, int i) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	private String street;
	private String city;
	private String state;
	private int pincode;
}

