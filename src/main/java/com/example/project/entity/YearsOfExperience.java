package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class YearsOfExperience {
	
	@Id
	@Column(name = "yEId")
	private long yEId;
	
	@Column(name = "yearsOfExp")
	private int yearsOfExp;

}
