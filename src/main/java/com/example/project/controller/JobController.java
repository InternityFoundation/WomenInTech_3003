package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.service.JobService;
import com.example.project.vo.JobResponseVO;


@RestController
public class JobController {
	@Autowired
	private JobService jobService;
	
	
	@GetMapping("/api/v1/job/{id}")
	public JobResponseVO getJobById(@PathVariable( value = "id") int id) {

		return jobService.getJobById(id);

}
	@GetMapping("/api/v1/jobfilter/{skills}")
	public JobResponseVO getJobBySkills(@PathVariable( value = "skills") String skills) {

		return jobService.getJobBySkills(skills);

}

}