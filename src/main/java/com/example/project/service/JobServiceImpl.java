package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.entity.Client;
import com.example.project.repository.JobDao;
import com.example.project.vo.JobResponseVO;


@Service
public class JobServiceImpl implements JobService {

	@Autowired
	private JobDao jobDao;

	@Override
	public JobResponseVO getJobById(int id) {

		JobResponseVO jobResponseVO = new JobResponseVO();
		Client client=null;
		client = jobDao.findById(id);	
		if (client == null) {
			jobResponseVO.setStatus(false);
			jobResponseVO.setMessage("profile does not exist");
			jobResponseVO.setData(null);
		} 
		else {
			jobResponseVO.setStatus(true);
			jobResponseVO.setMessage("success");
			jobResponseVO.setData(client);
		}
		return jobResponseVO;
	}
	
	@Override
	public JobResponseVO getJobBySkills(String skills) {

		JobResponseVO jobResponseVO = new JobResponseVO();
		List<Client> client= jobDao.findBySkills(skills);	
		if (client == null) {
			if(skills.equals("java")) {
			jobResponseVO.setStatus(false);
			jobResponseVO.setMessage("profile does not exist");
			jobResponseVO.setData(null);
		} }
		else {
			jobResponseVO.setStatus(true);
			jobResponseVO.setMessage("success");
			jobResponseVO.setData(client);
		}
		return jobResponseVO;
		

}
}