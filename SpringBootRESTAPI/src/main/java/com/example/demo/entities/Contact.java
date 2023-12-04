package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	
	@Column
	String fname;
	
	@Column
	String lname;
	
	@Column
	String email;
	
	@Column
	String contact;
	
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	@Column
	Date bdate;

	public Contact() {
		super();
		}

	
	public Contact(int cid, String fname, String lname, String email, String contact, Date bdate) {
		super();
		this.cid = cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.bdate = bdate;
	}

	

	public Contact(String fname, String lname, String email, String contact, Date bdate) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact = contact;
		this.bdate = bdate;
	}


	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}


	
	
	
}
