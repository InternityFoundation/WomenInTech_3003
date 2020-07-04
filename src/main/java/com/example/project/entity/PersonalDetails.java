package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "PersonalDetails")
public class PersonalDetails {

	@Id
	@Column(name = "jobId")
	private long jobId;
	
	@Column(name = "fullName")
	private String fullName;
	
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phonenumber")
	private long phoneNumber;
	
	@Column(name = "whatsAppNumber")
	private long whatsAppNumber;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "maritalStatus")
	private String maritalStatus;
	
	@Column(name = "languagesKnown")
	private String languagesKnown;
	
	@Column(name = "nativeLocation")
	private String nativeLocation;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getWhatsAppNumber() {
		return whatsAppNumber;
	}

	public void setWhatsAppNumber(long whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	public String getNativeLocation() {
		return nativeLocation;
	}

	public void setNativeLocation(String nativeLocation) {
		this.nativeLocation = nativeLocation;
	}
	
		}
