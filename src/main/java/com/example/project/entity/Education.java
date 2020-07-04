package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Education")
public class Education {
	
//	"schoolName":"ABC School",
//	"schoolBoard":"CBSE",
//	"duration":{
//	"from":"",
//	"to":""
//	},
//	"standard":"10th",
//	"result":"9.3cgpa"

	@Id
	@Column(name = "educationId")
	private long educationId;
	
	@Column(name = "schoolName")
	private String schoolName;
	
	
	@Column(name = "schoolBoard")
	private String schoolBoard;
	
	@Column(name = "duration")
	private String duration;
	
	@Column(name = "standard")
	private String standard;
	
	
	@Column(name = "result")
	private double result;


	public long getEducationId() {
		return educationId;
	}


	public void setEducationId(long educationId) {
		this.educationId = educationId;
	}


	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	public String getSchoolBoard() {
		return schoolBoard;
	}


	public void setSchoolBoard(String schoolBoard) {
		this.schoolBoard = schoolBoard;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
	}


	public String getStandard() {
		return standard;
	}


	public void setStandard(String standard) {
		this.standard = standard;
	}


	public double getResult() {
		return result;
	}


	public void setResult(double result) {
		this.result = result;
	}
	
	
	
}
