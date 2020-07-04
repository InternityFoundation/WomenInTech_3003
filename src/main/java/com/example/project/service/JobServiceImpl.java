package com.example.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.dao.JobDao;
import com.example.project.entity.PersonalDetails;
import com.example.project.vo.JobResponseVO;


@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDao jobDao;

	@Override
	public JobResponseVO getJobById(long jobId) {

		JobResponseVO jobResponseVO = new JobResponseVO();
	
		PersonalDetails personalDetails = jobDao.findByJobId(jobId);	
		if (personalDetails == null) {
			jobResponseVO.setStatus(false);
			jobResponseVO.setMessage("profile does not exist");
			jobResponseVO.setData(null);
		} 
		else {
			jobResponseVO.setStatus(true);
			jobResponseVO.setMessage("success");
			jobResponseVO.setData(personalDetails);
		}
		return jobResponseVO;
	}
}