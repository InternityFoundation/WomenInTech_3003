package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SocialLink")
public class SocialLink {
//	
//	"platform": "Github",
//	"link": "http://github.com/codeogeek"

	
	@Id
	@Column(name = "linkId")
	private long linkId;
	
	@Column(name = "platform")
	private String platform;
	
	
	@Column(name = "link")
	private String link;


	public long getLinkId() {
		return linkId;
	}


	public void setLinkId(long linkId) {
		this.linkId = linkId;
	}


	public String getPlatform() {
		return platform;
	}


	public void setPlatform(String platform) {
		this.platform = platform;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}

}
