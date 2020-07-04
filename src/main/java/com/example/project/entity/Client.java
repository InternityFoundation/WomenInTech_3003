
package com.example.project.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Client")
public class Client {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String gender;
	private String number;
	private String profession;
	private String location;
	private Date whatsAppNumber;
	private boolean married;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getWhatsAppNumber() {
		return whatsAppNumber;
	}
	public void setWhatsAppNumber(Date whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", email=" + email + ", gender=" + gender + ", number=" + number
				+ ", profession=" + profession + ", location=" + location + ", whatsAppNumber=" + whatsAppNumber
				+ ", married=" + married + "]";
	}
	
	// getters...
	// setters...

	// override toString()

}