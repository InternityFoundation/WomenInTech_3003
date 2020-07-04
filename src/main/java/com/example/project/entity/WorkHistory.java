package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "WorkHistory")
public class WorkHistory {
	
//	[
//	{
//	"orgName":"XYZ Company",
//	"tenure":{
//	"start_month":"feb",
//	"start_year":"2015",
//	"end_month":"june",
//	"end_year":"2017",
//	"isWorking":false
//	},
//	"title":"Software Engineer",
//	"Work":[
//	{
//	"ProjectName":"ABC",
//	"Description":"",
//	"contribution":"",
//	"duration":{
//	"from":"",
//	"to":""
//	},
//	"otherComment":""
//	}
//	]
//	}
//	]

	@Id
	@Column(name = "wHId")
	private long wHId;
	
	@Column(name = "orgName")
	private String orgName;
	
	
	@Column(name = "tenure")
	private long tenure;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "isWorking")
	@Type(type="org.hibernate.type.TrueFalseType")
	private boolean isWorking=true;
	
	@Column(name = "Work")
	private String Work;
	
	
	@Column(name = "otherComment")
	private String otherComment;


	public long getwHId() {
		return wHId;
	}


	public void setwHId(long wHId) {
		this.wHId = wHId;
	}


	public String getOrgName() {
		return orgName;
	}


	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}


	public long getTenure() {
		return tenure;
	}


	public void setTenure(long tenure) {
		this.tenure = tenure;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isWorking() {
		return isWorking;
	}


	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}


	public String getWork() {
		return Work;
	}


	public void setWork(String work) {
		Work = work;
	}


	public String getOtherComment() {
		return otherComment;
	}


	public void setOtherComment(String otherComment) {
		this.otherComment = otherComment;
	}
	
	


}
