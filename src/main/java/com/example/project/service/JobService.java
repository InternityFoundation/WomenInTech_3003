package com.example.project.service;

import com.example.project.vo.JobResponseVO;

public interface JobService {

	JobResponseVO getJobById(int id);
	JobResponseVO getJobBySkills(String skills);
	//ProfileDetailedResponseVO getProfileDetailedById(long profileId);

}
