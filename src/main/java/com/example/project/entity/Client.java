
package com.example.project.entity;

import java.sql.Date;

import javax.persistence.Column;
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
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "profession")
	private String profession;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "whatsAppNumber")
	private String whatsAppNumber;
	
	@Column(name = "married")
	private boolean married;
	
	@Column(name = "skills")
	private String skills;
	
	@Column(name = "workHistory")
	private String workHistory;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "socailLink")
	private String socailLink;
	
	@Column(name = "position")
	private String position;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getWorkHistory() {
		return workHistory;
	}
	public void setWorkHistory(String workHistory) {
		this.workHistory = workHistory;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getSocailLink() {
		return socailLink;
	}
	public void setSocailLink(String socailLink) {
		this.socailLink = socailLink;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	private String experience;
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
	public String getWhatsAppNumber() {
		return whatsAppNumber;
	}
	public void setWhatsAppNumber(String whatsAppNumber) {
		this.whatsAppNumber = whatsAppNumber;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", number=" + number
				+ ", profession=" + profession + ", location=" + location + ", whatsAppNumber=" + whatsAppNumber
				+ ", married=" + married + ", skills=" + skills + ", workHistory=" + workHistory + ", education="
				+ education + ", socailLink=" + socailLink + ", position=" + position + ", experience=" + experience
				+ "]";
	}
	
	

}