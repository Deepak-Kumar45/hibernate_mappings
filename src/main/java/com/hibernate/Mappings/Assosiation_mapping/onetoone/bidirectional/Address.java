package com.hibernate.Mappings.Assosiation_mapping.onetoone.bidirectional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_add_600")
public class Address {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int add_id;
		
		private String street;
		private String city;
		private long pincode;
		private String state;
	
		@OneToOne(mappedBy = "address")
		private Student std;

		public int getAdd_id() {
			return add_id;
		}

		public void setAdd_id(int add_id) {
			this.add_id = add_id;
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

		public long getPincode() {
			return pincode;
		}

		public void setPincode(long pincode) {
			this.pincode = pincode;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Student getStd() {
			return std;
		}

		public void setStd(Student std) {
			this.std = std;
		}

		public Address(String street, String city, long pincode, String state) {
			super();
			this.street = street;
			this.city = city;
			this.pincode = pincode;
			this.state = state;
		}

		public Address() {
			super();
		}

		@Override
		public String toString() {
			return "Address [add_id=" + add_id + ", street=" + street + ", city=" + city + ", pincode=" + pincode
					+ ", state=" + state + "]";
		}
		
}
