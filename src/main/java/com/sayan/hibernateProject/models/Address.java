package com.sayan.hibernateProject.models;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id")
	private int addressId;
	
	@Column(name = "STREET", length = 50)
	private String street;
	
	@Column(name = "CITY", length = 100)
	private String city;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Transient
	private int x;
	
	@Column(name = "creation_date")
	@Temporal(TemporalType.DATE)
	private Date CreateDate;
	
	@Lob
	private byte[] image;
	
	public Address() {}

	public Address(int addressId, String street, String city, boolean isOpen, int x, Date createDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		CreateDate = createDate;
		this.image = image;
	}

	public Address(String street, String city, boolean isOpen, int x, Date createDate, byte[] image) {
		super();
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		CreateDate = createDate;
		this.image = image;
	}
	
	

	public Address(String street, String city, boolean isOpen, int x, Date createDate) {
		super();
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		CreateDate = createDate;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
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

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Date getCreateDate() {
		return CreateDate;
	}

	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", CreateDate=" + CreateDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
}
